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

    private void validarNota(double nota, double notaMaxima, String nomeAvaliacao) {
        if (nota < 0 || nota > notaMaxima) {
            throw new IllegalArgumentException(
                    nomeAvaliacao + " deve estar entre 0 e " + notaMaxima);
        }
    }

    public String situacao(double notaFinal, double frequencia) { // "APROVADO" ou "REPROVADO"
       /* String resultado;
        if (notaFinal >= 70 && frequencia >= 75) {
            resultado = 'Aprovado';
        }
        else{    
            throw new IllegalArgumentException("Para aprovar a nota deve ser maior ou igual a 70 e a frequencia deve ser maior ou igual a 75");
        }

        if (a2 < 0 || a2 > 30) {
            throw new IllegalArgumentException("A2 deve estar entre 0 e 30");
        }
        if (a3 < 0 || a3 > 0) {
            throw new IllegalArgumentException("A3 deve estar entre 0 e 40");
        }
      */
        return ""; 

    } 

   /* public boolean podeFazerAI(double a1, double a2, double a3, double frequencia) {

    } */


}
