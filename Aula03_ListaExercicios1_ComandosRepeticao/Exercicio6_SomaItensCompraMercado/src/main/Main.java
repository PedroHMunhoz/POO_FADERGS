package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos de Repetição (WHILE, DO...WHILE, FOR) 
     * Exercício 6 - Um cliente de supermercado fez uma compra de 20 itens. 
     * Leia o preço de cada item e calcule o total que a pessoa vai pagar.
     */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Variável para armazenar o valor do item digitado pelo usuário
        float valorItem;

        // Variável para o cálculo do valor total a ser pago pelo cliente
        float valorTotal = 0;

        // Faz o loop 20x, para ler o valor dos itens comprados
        for (int i = 1; i <= 20; i++) {
            
            // Solicita o valor para o usuário
            System.out.println("Digite o valor do item " + i + ": ");

            // Armazena o valor digitado na variável
            valorItem = leitura.nextFloat();

            // Faz o somatório para fechar o valor total
            valorTotal += valorItem;
        }

        // Imprime o resultado para o usuário
        System.out.println("O valor total da compra do cliente foi de R$ " + valorTotal);
    }
}
