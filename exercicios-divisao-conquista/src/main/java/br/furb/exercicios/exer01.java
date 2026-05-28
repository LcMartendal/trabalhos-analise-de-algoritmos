package br.furb.exercicios;

import java.util.Arrays;

public class exer01 {
    //Questão 1 *: Dado um vetor ordenado A você precisa verificar se um determinado valor existe
    //e qual é o indice dele no vetor. Utilize um algoritmo de divisão e conquista para solucionar
    //este problema

    public static int buscaRecursiva(int[] vetor, int valor) {
        if (vetor.length == 0) { return -1; }

        int meio = vetor.length / 2;

        if (vetor[meio] == valor) { return meio; }

        if (valor > vetor[meio]) {

            int[] vetorAux = Arrays.copyOfRange(vetor, meio + 1, vetor.length);

            int resultado = buscaRecursiva(vetorAux, valor);

            if (resultado == -1) {
                return -1;
            }
            return resultado + meio + 1;
        }

        else {
            int[] vetorAux = Arrays.copyOfRange(vetor, 0, meio);
            return buscaRecursiva(vetorAux, valor);
        }
    }
}
