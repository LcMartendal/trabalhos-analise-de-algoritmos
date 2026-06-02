package org.example.exercicios.exer01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algoritmo {

    public static List<Item> algoritmoPreencherComMaximoDeItens(int capacidadeVeiculo, List<Item> itensDisponiveis) {

        itensDisponiveis.sort((a, b) -> a.valor - b.valor);

        List<Item> itensParaCarregar = new ArrayList<>();

        int qtdeCarregada = 0;

        for (int i = 0; i < itensDisponiveis.size(); i++) {

            if (qtdeCarregada == capacidadeVeiculo) break;

            Item itemAtual = itensDisponiveis.get(i);

            while ((qtdeCarregada + itemAtual.valor) <= capacidadeVeiculo) {
                itensParaCarregar.add(itemAtual);
                qtdeCarregada += itemAtual.valor;
            }
        }

        return itensParaCarregar;
    }

    public static List<Item> algoritmoPreencherComMaximoDeItensPRO(int capacidadeVeiculo, List<Item> itensDisponiveis) {

        itensDisponiveis.sort((a, b) -> a.valor - b.valor);

        List<Item> itensParaCarregar = new ArrayList<>();

        int qtdeCarregada = 0;

        for (int i = 0; i < itensDisponiveis.size(); i++) {

            if (qtdeCarregada == capacidadeVeiculo) break;

            Item itemAtual = itensDisponiveis.get(i);

            while ((qtdeCarregada + itemAtual.valor) <= capacidadeVeiculo) {
                itensParaCarregar.add(itemAtual);
                qtdeCarregada += itemAtual.valor;
            }

            Item proximoItem = null;
            if (itensDisponiveis.size()-1 > i+1) {
                proximoItem = itensDisponiveis.get(i+1);
            }


            if (qtdeCarregada < capacidadeVeiculo) {
                if (proximoItem != null
                        && (qtdeCarregada - itemAtual.valor + proximoItem.valor) <= capacidadeVeiculo
                ) {
                    qtdeCarregada -= itemAtual.valor;
                    itensParaCarregar.remove(itemAtual);
                }
            }
        }

        return itensParaCarregar;
    }

    public static List<Item> algoritmoPreencherComMinimoDeItens(int capacidadeVeiculo, List<Item> itensDisponiveis) {

        itensDisponiveis.sort((a, b) -> b.valor - a.valor);

        List<Item> itensParaCarregar = new ArrayList<>();

        int qtdeCarregada = 0;

        for (int i = 0; i < itensDisponiveis.size(); i++) {

            if (qtdeCarregada == capacidadeVeiculo) break;

            Item itemAtual = itensDisponiveis.get(i);

            while ((qtdeCarregada + itemAtual.valor) <= capacidadeVeiculo) {
                itensParaCarregar.add(itemAtual);
                qtdeCarregada += itemAtual.valor;
            }
        }

        return itensParaCarregar;
    }
}
