package com.gqs.aula.tdd;

public class CalculadoraNota {

    public double calcularNotaFinal(double a1, double a2, double a3) {
        validarNota(a1, 30, "A1");
        validarNota(a2, 30, "A2");
        validarNota(a3, 40, "A3");

        return a1 + a2 + a3;
    }

    public static final double NOTA_MINIMA_APROVACAO = 70;
    public static final double FREQUENCIA_MINIMA = 75;
    public static final String APROVADO = "APROVADO";
    public static final String REPROVADO_POR_FALTA = "REPROVADO POR FALTA";
    public static final String REPROVADO_POR_NOTA = "REPROVADO POR NOTA";
    
    public boolean estaAprovadoPorNota(double notaFinal) {
        return notaFinal >= NOTA_MINIMA_APROVACAO;
    }

    public String situacao(double notaFinal, double frequencia) {
        if (frequencia < FREQUENCIA_MINIMA) {
            return REPROVADO_POR_FALTA;
        }

        if (!estaAprovadoPorNota(notaFinal)) {
            return REPROVADO_POR_NOTA;
        }

        return APROVADO;
    }

    public boolean podeFazerAI(double a1, double a2, double a3, double frequencia) {
        double notaFinal = calcularNotaFinal(a1, a2, a3);

        return notaFinal < NOTA_MINIMA_APROVACAO
                && frequencia >= FREQUENCIA_MINIMA
                && (a1 + a3 >= 40 || a2 + a3 >= 40);
    }

    public double aplicarAI(double a1, double a2, double a3, double notaAI) {
        validarNota(notaAI, 30, "AI");

        double menorNota = Math.min(a1, a2);

        if (notaAI > menorNota) {
            if (a1 == menorNota) {
                a1 = notaAI;
            } else {
                a2 = notaAI;
            }
        }

        return calcularNotaFinal(a1, a2, a3);
    }

    private void validarNota(double nota, double notaMaxima, String nomeAvaliacao) {
        if (nota < 0 || nota > notaMaxima) {
            throw new IllegalArgumentException(
                    nomeAvaliacao + " deve estar entre 0 e " + notaMaxima);
        }
    }
}