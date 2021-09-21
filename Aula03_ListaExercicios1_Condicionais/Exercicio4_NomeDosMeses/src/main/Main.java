package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos Condicionais(IF...ELSE, SWITCH CASE) 
     * Exercício 4 - Escreva um programa que leia um número entre 1 e 12 e 
     * escreva o mês correspondente. Ex: Se o número lido for 2, deverá ser 
     * mostrado ao usuário “Fevereiro”.
     */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Variável para armazenar o número do mês digitado
        int numeroMes;

        // Solicita a informação do usuário
        System.out.println("Informe o número do mês, de 1 a 12 para mostrar"
                + "o nome do mês:");

        // Lê o valor digitado para a variável
        numeroMes = leitura.nextInt();

        /**
         * Faz um switch com o valor informado pelo usuário, mostrando o nome do
         * mês conforme o que foi digitado. Caso seja digitado um número fora do
         * intervalo, cai no default e mostra a mensagem de erro para o usuário.
         */
        switch (numeroMes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido! Deve estar entre 1 e 12.");
                break;
        }
    }
}
