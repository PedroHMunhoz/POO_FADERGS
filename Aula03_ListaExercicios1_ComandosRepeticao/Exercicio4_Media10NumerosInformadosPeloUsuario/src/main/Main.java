package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos de Repetição (WHILE, DO...WHILE, FOR) 
     * Exercício 4 - Calcular a média de 10 números informados pelo usuário.
     */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Variável de contador, para controlar o laço Do...While
        int contador = 1;

        // Variável para armazenar o valor digitado pelo usuário
        float valorInformado;

        // Variável para o somatório dos valores informados pelo usuário
        float soma = 0;

        // Variável para o cálculo da média
        float media = 0;

        // Com a lógica abaixo, o loop será executado 10x, portanto serão
        // informados 10 números pelo usuário, os quais serão somados na variável
        // e depois calculada a média
        
        // Fazer a leitura dos números do usuário
        do {
            
            // Solicita entrada para o usuário
            System.out.println("Informe um valor: ");
            
            // Lê o valor digitado pelo usuário
            valorInformado = leitura.nextFloat();

            // Soma na variável de soma o valor informado com o que já está lá
            soma += valorInformado;

            // Incrementa o contador que faz o controle do laço Do...While
            contador++;
        } while (contador <= 10); // Enquanto o contador for menor ou igual à 10

        // Calcula a média, dividindo o somatório dos valores pela quantidade 
        // total de valores informados, que é 10
        media = soma / 10;

        // Printa a média
        System.out.println("A média é: " + media);
    }
}
