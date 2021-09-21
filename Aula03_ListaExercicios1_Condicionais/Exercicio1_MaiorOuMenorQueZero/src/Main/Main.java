package Main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {
    /**
     * Exercícios sobre Comandos Condicionais(IF...ELSE, SWITCH CASE) 
     * Exercício 1 - Ler um número e determinar se ele é maior ou igual 
     * ou menor do que zero.
     */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Variável para armazenar o valor informado pelo usuário
        float numero = 0;

        // Solicita a entrada do usuário
        System.out.println("Digite um número para verificar se ele é maior ou"
                + "menor do que zero:");

        // Faz a leitura para a variável float
        numero = leitura.nextFloat();

        if (numero >= 0) {
            System.out.println("O número é maior ou igual a ZERO!");
        } else {
            System.out.println("O número é menor do que ZERO!");
        }
    }

}
