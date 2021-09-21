package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos Condicionais(IF...ELSE, SWITCH CASE) 
     * Exercício 5 - Escreva um programa que leia 4 números e exiba qual o 
     * menor deles.
     */
    public static void main(String[] args) {
         // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);
        
        // Prefixo da mensagem a ser exibida para o usuário
        String prefixoMensagem = "O menor número é: ";

        // Variáveis para os números lidos
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        
        // Solicita a leitura dos 4 números para o usuário
        System.out.println("Digite o primeiro número:");
        numero1 = leitura.nextInt();
        
        System.out.println("Digite o segundo número:");
        numero2 = leitura.nextInt();
        
        System.out.println("Digite o terceiro número:");
        numero3 = leitura.nextInt();
        
        System.out.println("Digite o quarto número:");
        numero4 = leitura.nextInt();
        
        // Verifica se o número 1 é o menor dentre todos
        if(numero1 < numero2 && numero1 < numero3 && numero1 < numero4)
        {
            System.out.println(prefixoMensagem + numero1);
        }
        // Verifica se o número 2 é o menor dentre todos
        else if(numero2 < numero1 && numero2 < numero3 && numero2 < numero4)
        {
            System.out.println(prefixoMensagem + numero2);
        }
        // Verifica se o número 3 é o menor dentre todos
        else if(numero3 < numero1 && numero3 < numero2 && numero3 < numero4)
        {
            System.out.println(prefixoMensagem + numero3);
        }
        else // Se não for o número 1, 2 nem 3 então o número 4 será o menor
        {
            System.out.println(prefixoMensagem + numero4);
        }
    }   
}