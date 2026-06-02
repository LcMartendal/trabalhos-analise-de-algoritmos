package org.example.Main;

import org.example.exercicios.exer01.Item;

import java.util.ArrayList;
import java.util.List;

import static org.example.exercicios.exer01.Algoritmo.algoritmoPreencherComMaximoDeItensPRO;

public class Main {

    public static void main(String[] args) {
        // --- EXER 01 ---
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



    }
}
