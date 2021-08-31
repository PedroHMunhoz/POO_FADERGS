package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */

public class Main {

    /**
     * Exercícios sobre operações matemáticas, leitura e escrita de dados
     * Exercício 1 - Calcular e mostrar a metade de um número.
     */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);
        
        // Variável float para armazenar o número digitado
        float numero;
        
        // Variável para armazenar o resultado do cálculo da metade
        float metade;
        
        // Pede para o usuário informar um número qualquer
        System.out.println("Digite um número para calcular sua metade: ");
        
        // Faz a leitura para a variável float
        numero = leitura.nextFloat();
        
        // Calcula a metade e salva numa varíavel
        metade = numero / 2;
        
        // Imprime o valor na tela
        System.out.println("A metade de " + numero + " é " + metade);
    }   
}
