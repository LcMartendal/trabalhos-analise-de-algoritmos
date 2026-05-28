package br.furb.exercicios;

import java.util.Arrays;

public class exer04 {
    //Questão 4 *: Assumindo que existe um vetor A de valores não ordenados, queremos saber qual é o
    //valor que representa a maioria. Para um valor ser a maioria, a quantidade do mesmo valor deve ser
    //maior que o tamanho/2, ou seja, 50% + 1 dos elementos devem ter o mesmo valor para que ele seja
    //considerado maioria. Entretanto estes elementos possuem algumas restrições, não é possível
    //determinar se um valor é maior ou menor que outro, apenas podemos atestar que um valor é igual ou
    //diferente que outro. A partir desta premissa, desenvolva um algoritmo de divisão e conquista que
    //encontre o valor que representa a maioria neste vetor. Como exemplo pode utilizar o vetor
    //[1,2,1,1,3], valor esperado “1”

    public static int buscaValorMaioriaRecursivamente(int[] vetor) {

        if (vetor.length == 0) return -1;

        int candidato = valorMaioria(vetor);

        int ocorrencias = contar(vetor, candidato);

        if (ocorrencias > vetor.length / 2) return candidato;

        return -1;
    }

    private static int valorMaioria(int[] vetor) {
        if (vetor.length == 1) return vetor[0]; // caso base

        int meio = vetor.length / 2;

        int[] esquerdo = Arrays.copyOfRange(vetor, 0, meio);
        int[] direito = Arrays.copyOfRange(vetor, meio, vetor.length);

        int candidatoEsquerdo = valorMaioria(esquerdo);
        int candidatoDireito = valorMaioria(direito);

        if (candidatoEsquerdo == candidatoDireito) return candidatoEsquerdo;// se forem iguais, já encontrou

        // conta ocorrências dos dois candidatos
        int contEsq = contar(vetor, candidatoEsquerdo);
        int contDir = contar(vetor, candidatoDireito);

        // retorna o que aparece mais
        if (contEsq > contDir) return candidatoEsquerdo;

        return candidatoDireito;
    }

    private static int contar(int[] vetor, int valor) {
        int contador = 0;

        for (int elemento : vetor) {
            if (elemento == valor) contador++;
        }

        return contador;
    }
}
