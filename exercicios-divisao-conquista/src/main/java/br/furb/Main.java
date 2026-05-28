package br.furb;

import static br.furb.exercicios.exer01.buscaRecursiva;
import static br.furb.exercicios.exer02.buscaValorIgualIndiceRecursivo;
import static br.furb.exercicios.exer03.inverterString;
import static br.furb.exercicios.exer04.buscaValorMaioriaRecursivamente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // --- EXER 01 ---
        System.out.println("--------------- EXER 01 ---------------");
        int[] vetor01 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int valor = 1;
        int indice = buscaRecursiva(vetor01, valor);

        if (indice != -1) {
            System.out.println("Valor " + valor + " encontrado no índice: " + indice);
        } else {
            System.out.println("Valor " + valor + " não encontrado no vetor.");
        }
        System.out.println(" ");
        //---

        // --- EXER 02 ---
        System.out.println("--------------- EXER 02 ---------------");
        int[] vetor02 = {-1,-1,1,3,8,9};
        int valorEIndice = buscaValorIgualIndiceRecursivo(vetor02);

        if (valorEIndice != -1) {
            System.out.println("Valor igual ao indice que está: " + valorEIndice);
        } else {
            System.out.println("Não acontece igualdade");
        }
        System.out.println(" ");
        // ---

        // --- EXER 03
        System.out.println("--------------- EXER 03 ---------------");
        String palavraParaInverter = "FURB";
        String palavraInvertida = inverterString(palavraParaInverter);

        System.out.println("A palavra "+palavraParaInverter+" invertida é: " + palavraInvertida);
        System.out.println(" ");
        // ---

        // --- EXER 04
        System.out.println("--------------- EXER 04 ---------------");
        int[] vetor04 = {1,2,1,1,3};
        int valorMaioria = buscaValorMaioriaRecursivamente(vetor04);

        if (valorEIndice != -1) {
            System.out.println("Valor maioria no vetor: " + valorMaioria);
        } else {
            System.out.println("Não tem maioria");
        }
        // ---
    }
}