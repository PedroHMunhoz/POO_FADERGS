package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos Condicionais(IF...ELSE, SWITCH CASE) 
     * Exercício 3 - Escreva um programa para ler o nome de dois times de 
     * futebol e o número de gols marcados por cada time na partida. O programa 
     * deve imprimir o nome do time vencedor. Caso não haja vencedor deverá ser
     * impresso EMPATE.
     */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Variáveis para a leitura dos nomes dos times
        String nomeTimeA;
        String nomeTimeB;

        // Variáveis para a leitura dos gols
        int quantidadeGolsTimeA;
        int quantidadeGolsTimeB;

        // Solicita os dados do Time A
        System.out.println("Informe o nome do time A:");

        // Lê o nome do Time A
        nomeTimeA = leitura.next();
        leitura.nextLine(); // Limpa buffer

        // Lê a quantidade de gols do Time A
        System.out.println("Informe a quantidade de gols do Time A:");
        quantidadeGolsTimeA = leitura.nextInt();

        // Solicita os dados do Time B
        System.out.println("Informe o nome do time B:");

        // Lê o nome do Time B
        nomeTimeB = leitura.next();
        leitura.nextLine(); // Limpa buffer

        // Lê a quantidade de gols do Time B
        System.out.println("Informe a quantidade de gols do Time B:");
        quantidadeGolsTimeB = leitura.nextInt();

        // Se o Time A fez mais gols que o Time B, significa que ele é o 
        // vencedor, então printa o nome do Time A
        if (quantidadeGolsTimeA > quantidadeGolsTimeB) 
        {
            System.out.println(nomeTimeA);
        } 
        // Se o Time B fez mais gols que o Time A, significa que ele é o 
        //vencedor, então printa o nome do Time B
        else if (quantidadeGolsTimeB > quantidadeGolsTimeA) 
        {
            System.out.println(nomeTimeB);
        } 
        else // Se nenhum dos dois venceu, printa EMPATE
        {
            System.out.println("EMPATE");
        }
    }
}
