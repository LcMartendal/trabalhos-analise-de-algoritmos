package br.furb.exercicios;

import java.util.Arrays;

public class exer02 {
    //Questão 2 *: Dado um vetor ordenado A encontre um valor i onde A[i]=i, ou seja, encontre um
    //valor no vetor A que seu elemento tenha o mesmo valor que o seu índice. Exemplo de entrada
    //[-1,-1,1,3,8,9], valor esperado “3”

    public static int buscaValorIgualIndiceRecursivo(int[] vetor) {
        if (vetor.length == 0) { return -1; }

        int meio = vetor.length / 2;

        if (meio == vetor[meio]) { return meio; }

        var valorIndice = vetor[meio];
        if (valorIndice > vetor[meio]) {

            int[] vetorAux = Arrays.copyOfRange(vetor, meio + 1, vetor.length);

            int resultado = buscaValorIgualIndiceRecursivo(vetorAux);

            if (resultado == -1) {
                return -1;
            }
            return resultado + meio + 1;
        }

        else {
            int[] vetorAux = Arrays.copyOfRange(vetor, 0, meio);
            return buscaValorIgualIndiceRecursivo(vetorAux);
        }
    }
}
