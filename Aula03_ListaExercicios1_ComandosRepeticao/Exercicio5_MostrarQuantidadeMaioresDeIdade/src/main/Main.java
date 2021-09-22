package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos de Repetição (WHILE, DO...WHILE, FOR) 
     * Exercício 5 - Leia a idade de 20 pessoas e exiba quantas pessoas são 
     * maiores de idade.
     */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Variável de contador, para controlar o laço Do...While
        int contador = 1;

        // Variável para armazenar a idade informada pelo usuário
        int idadeInformada;

        // Variável para somar quantas pessoas são maiores de idade
        int qtdMaioresDeIdade = 0;

        // Com a lógica abaixo, o loop será executado 20x, portanto serão
        // informados 20 idades pelo usuário e incrementando a variável
        // de quantidade de maiores de idade, teremos o resultado ao final
        
        // Fazer a leitura das idades informadas pelo usuário
        do {
            // Solicita entrada para o usuário
            System.out.println("Informe uma idade: ");

            // Lê o valor digitado pelo usuário
            idadeInformada = leitura.nextInt();

            // Se o valor informado for maior ou igual a 18, incrementa a
            // variável que soma a quantidade de maiores de idade
            if (idadeInformada >= 18) {
                qtdMaioresDeIdade++;
            }

            // Incrementa o contador que faz o controle do laço Do...While
            contador++;

        } while (contador <= 20); // Enquanto o contador for menor ou igual à 20

        // Informa quantas das pessoas informadas é maior de idade
        System.out.println("A quantidade de maiores de idade é: " + qtdMaioresDeIdade);
    }

}
