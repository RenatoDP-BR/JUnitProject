package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operação: + - * / => ");
        String operacao = scanner.nextLine();

        Calculadora calculadora = new Calculadora(operacao);

        boolean resultadoValidaOperacao = calculadora.validaOperacao(operacao);
        if (resultadoValidaOperacao == false){
            System.out.println("Operacao Invalida!");
        }

        System.out.print("Digite o 1o numero: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o 2o numero: ");
        int numero2 = Integer.parseInt(String.valueOf(scanner.nextInt()));

        int resultado = calculadora.soma(numero1, numero2);

        System.out.println(numero1 + operacao + numero2 + " é igual a : " + resultado);

        scanner.close();

    }
}