package org.example.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.example.exercicios.exer01.Algoritmo.algoritmoPreencherComMaximoDeItensPRO;
import org.example.exercicios.exer01.Item;
import static org.example.exercicios.exer02.Algoritmo2.calcular;
import org.example.exercicios.exer02.Lugar;
import org.example.exercicios.exer03.Algoritmo;
import org.example.exercicios.exer03.Estacao;

public class Main {

    public static void main(String[] args) {
        // --- EXER 01 ---
        System.out.println("Questão 1:\n");
        List<Item> itensDisponiveis = new ArrayList();
        itensDisponiveis.add(new Item(1,40));
        itensDisponiveis.add(new Item(2,30));
        itensDisponiveis.add(new Item(3,25));
        itensDisponiveis.add(new Item(4,20));
        itensDisponiveis.add(new Item(5,15));
        int qtdeMaximaCarregamento = 100;

        var itensCarregados = algoritmoPreencherComMaximoDeItensPRO(qtdeMaximaCarregamento, itensDisponiveis);
        for (Item i : itensCarregados) {
            System.out.println("Item: " + i.id + " com valor "+ i.valor +" carregado");
        }

        //Seu algoritmo é capaz de retornar a solução ótima?
        //R: O mais próximo, mas é custoso, pois é testado o próximo item a ser posto para fechar o mais próximo de 100.
        // ---

        // --- EXER 02 ---
        System.out.println("\nQuestão 2:\n");
        List<Lugar> lugares = new ArrayList<>();
        lugares.add(new Lugar("Museu",   10, 2));
        lugares.add(new Lugar("Torre",   18, 5));
        lugares.add(new Lugar("Parque",   8, 1));
        lugares.add(new Lugar("Castelo", 12, 3));
        int diasDisponiveis = 7;

        var roteiro = calcular(lugares, diasDisponiveis);
        for (Lugar l : roteiro) {
            System.out.println("Lugar: " + l.nome + " com valor " + l.valor + " visitado");
        }
        /*Essa solução é ideal?
        R: Não. O algoritmo guloso por razão Valor/Tempo escolheu Parque, Museu e Castelo
        totalizando 30 pontos em 6 dias. Porém a combinação ótima seria Torre + Parque
        = 26 pontos em 6 dias (menor) ou Torre + Museu = 28 pontos em 7 dias.
        Neste caso específico o guloso até supera outras combinações (30 pontos),
        mas não garante ótimo global em todas as instâncias, pois ignora
        combinações futuras ao tomar a decisão local.*/


        
        // --- EXER 03 ---
        System.out.println("\nQuestão 3:\n");
        Set<String> estadosAlvo = new HashSet<>(Arrays.asList("mt", "rj", "es", "sp", "sc", "rs", "pr", "ms"));
        //List<Estacao> estacoesAnunciaveis = new ArrayList<>();
        List<Estacao> estacoesAnunciaveis = new ArrayList<>();
        estacoesAnunciaveis.add(new Estacao("Kum", new HashSet<>(Arrays.asList("sp", "sc", "rs"))));
        estacoesAnunciaveis.add(new Estacao("Kdois", new HashSet<>(Arrays.asList("rj", "sp", "mt"))));
        estacoesAnunciaveis.add(new Estacao("Ktres", new HashSet<>(Arrays.asList("es", "sc", "pr"))));
        estacoesAnunciaveis.add(new Estacao("Kquatro", new HashSet<>(Arrays.asList("sc", "rs"))));
        estacoesAnunciaveis.add(new Estacao("Kcinco", new HashSet<>(Arrays.asList("pr", "ms"))));

        List<Estacao> resultado = Algoritmo.algoritmo(estadosAlvo, estacoesAnunciaveis);
        
        System.out.println("Estações selecionadas pelo algoritmo ganancioso:");
        for(Estacao e : resultado) {
            System.out.println(e.nome + " (Que cobre os estados: " + e.cobertura + ")");
        }
    }
}
