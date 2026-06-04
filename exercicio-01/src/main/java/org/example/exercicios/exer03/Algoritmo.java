package org.example.exercicios.exer03;


import java.util.ArrayList;
import java.util.HashSet;   
import java.util.List;
import java.util.Set;   

public class Algoritmo {
        public static List<Estacao> algoritmo(Set<String> estadosAlvo, List<Estacao> estacoesAnunciaveis) {
            List<Estacao> estacoesEscolhidas = new ArrayList<>();
            Set<String> outrosEstados = new HashSet<>(estadosAlvo);

            while (!outrosEstados.isEmpty()) {
                Estacao estacaoIdeal = null;
                int estadosCobertos = 0;   

                for (int i = 0; i < estacoesAnunciaveis.size(); i++) {
                    Estacao estacaoAtual = estacoesAnunciaveis.get(i);
                    int estadoCobertosAtual = contarEstadosCobertos(estacaoAtual.cobertura, outrosEstados);
                    if (estadoCobertosAtual > estadosCobertos) {
                        estacaoIdeal = estacaoAtual;
                        estadosCobertos = estadoCobertosAtual;
                    }
                }

                if (estadosCobertos == 0 || estacaoIdeal == null) break;
                
                estacoesEscolhidas.add(estacaoIdeal);
                Set<String> coberturaIdealMinuscula = new HashSet<>();
                for (String c : estacaoIdeal.cobertura) {
                    coberturaIdealMinuscula.add(c.toLowerCase());
                }
                outrosEstados.removeAll(coberturaIdealMinuscula);
                estacoesAnunciaveis.remove(estacaoIdeal);
            }

            return estacoesEscolhidas;


        }

        private static int contarEstadosCobertos(Set<String> estacaoCoberta, Set<String> outrosEstados) {
            int contador = 0;
            for (String estado : estacaoCoberta) {
                if (outrosEstados.contains(estado)) contador++;
            }

         return contador;    
    }
}






