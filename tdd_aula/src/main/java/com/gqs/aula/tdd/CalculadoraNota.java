package com.gqs.aula.tdd;

public class CalculadoraNota {

    public double calcularNotaFinal(double a1, double a2, double a3) {
        validarNota(a1, 30, "A1");
        validarNota(a2, 30, "A2");
        validarNota(a3, 40, "A3");
        
        return a1 + a2 + a3;
    }

    public static final double NOTA_MINIMA_APROVACAO = 70;
    public boolean estaAprovadoPorNota(double notaFinal) {
        return notaFinal >= NOTA_MINIMA_APROVACAO;
    }
    public static final double FREQUENCIA_MINIMA_APROVACAO = 75;
    public boolean estaAprovadoPorFrequencia(double frequenciaFinal) {
        return frequenciaFinal >= FREQUENCIA_MINIMA_APROVACAO;
    }

    private void validarNota(double nota, double notaMaxima, String nomeAvaliacao) {
        if (nota < 0 || nota > notaMaxima) {
            throw new IllegalArgumentException(
                    nomeAvaliacao + " deve estar entre 0 e " + notaMaxima);
        }
    }

    public String situacao(double notaFinal, double frequencia) { // "APROVADO" ou "REPROVADO"
        String resultado;

        if (notaFinal >= 70 && frequencia >= 75) {
            resultado = "Aprovado";
        }
        else{    
            throw new IllegalArgumentException("Para aprovar a nota deve ser maior ou igual a 70 e a frequencia deve ser maior ou igual a 75");
        }

        
        return resultado; 

    } 

   /* public boolean podeFazerAI(double a1, double a2, double a3, double frequencia) {

    } */


private void validarFrequencia(double frequencia) {
        if (frequencia < 75) {
            throw new IllegalArgumentException(
                    "A sua frequencia deve estar acima de 75. A sua frequencia atual é" + frequencia);
        }
    }
}
