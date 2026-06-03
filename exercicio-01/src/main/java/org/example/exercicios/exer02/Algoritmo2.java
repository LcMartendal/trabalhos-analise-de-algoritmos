package org.example.exercicios.exer02;

import java.util.*;

public class Algoritmo2 {

    public static List<Lugar> calcular(List<Lugar> lugares, int diasDisponiveis) {
        lugares.sort((a, b) ->
                Double.compare((double) b.valor / b.dias, (double) a.valor / a.dias));

        List<Lugar> roteiro = new ArrayList<>();
        int diasUsados = 0;

        for (Lugar lugar : lugares) {
            if (diasUsados + lugar.dias <= diasDisponiveis) {
                roteiro.add(lugar);
                diasUsados += lugar.dias;
            }
        }

        return roteiro;
    }
}
