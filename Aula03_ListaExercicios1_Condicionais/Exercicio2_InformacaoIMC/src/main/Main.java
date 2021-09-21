package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos Condicionais(IF...ELSE, SWITCH CASE) 
     * Exercício 2 - Faça um programa que leia o índice de massa corporal (IMC) 
     * de uma pessoa. Se o valor do IMC for maior do que 25,0 deverá ser exibida
     * a mensagem “Você está acima do peso!”. Caso contrário exiba a mensagem
     * “Você está saudável!”.
     */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Variável para armazenar o IMC informado pelo usuário
        float valorIMC = 0;

        // Solicita a entrada do usuário
        System.out.println("Informe o valor do IMC: ");

        // Faz a leitura para a variável float
        valorIMC = leitura.nextFloat();

        if (valorIMC > 25.0) {
            System.out.println("Você está acima do peso!");
        } else {
            System.out.println("Você está saudável!");
        }
    }
}
