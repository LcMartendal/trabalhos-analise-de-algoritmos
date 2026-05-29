package org.example.exercicios.exer01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algoritmo {

    public static List<Item> algoritmo(int capacidadeVeiculo, List<Item> itensDisponiveis) {

        ordenarLista(itensDisponiveis);

        List<Item> itensParaCarregar = new ArrayList<>();

        int qtdeCarregada = 0;

        for (int i = 0; i < itensDisponiveis.size(); i++) {

            if (qtdeCarregada == capacidadeVeiculo) break;

            Item itemAtual = itensDisponiveis.get(i);

            while ((qtdeCarregada + itemAtual.valor) <= capacidadeVeiculo) {

                itensParaCarregar.add(itemAtual);

                qtdeCarregada += itemAtual.valor;
            }

            if (qtdeCarregada < capacidadeVeiculo) qtdeCarregada -= itemAtual.valor;
        }

        return itensParaCarregar;
    }

    private static List<Item> ordenarLista(List<Item> itens) {
        Collections.sort(itens, (a, b) -> a.valor - b.valor);

        return itens;
    }

}
