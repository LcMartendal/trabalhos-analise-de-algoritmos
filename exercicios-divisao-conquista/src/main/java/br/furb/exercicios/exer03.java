package br.furb.exercicios;

public class exer03 {
    //Questão 3 *: Faça um algortmo de divisão e conquista para inverter uma string. Exemplo, para
    //a string “FURB” o resultado deve ser “BRUF”

    public static String inverterString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        int meio = str.length() / 2;
        String esquerda = str.substring(0, meio);
        String direita = str.substring(meio);

        String esquerdaInvertida = inverterString(esquerda);
        String direitaInvertida = inverterString(direita);

        return direitaInvertida + esquerdaInvertida;
    }
}
