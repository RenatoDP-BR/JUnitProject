package main.java;

public class Calculadora {
    private int numero1;
    private int numero2;
    private String operacao;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora(String operacao) {
        this.operacao = operacao;
    }

    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public boolean validaOperacao(String operacao) {
        boolean resultado = true;
        if (!operacao.equals("+") & !operacao.equals("-") &
            !operacao.equals("*") & !operacao.equals("/")) {
            resultado = false;
        }
        return resultado;
    }


}
