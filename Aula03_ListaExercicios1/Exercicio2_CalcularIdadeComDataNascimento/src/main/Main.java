package main;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */

public class Main {

    /**
    * Exercícios sobre operações matemáticas, leitura e escrita de dados
    * Exercício 2 - Calcular a idade de uma pessoa, sabendo-se o ano de nascimento.
    */
    
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);
        
        // Variável instanciando o objeto Calendar, para ter acesso aos 
        // métodos de data, ano, mês, etc.
        Calendar cal = Calendar.getInstance();
        
        // Variável para armazenar o ano digitado pelo usuário
        int anoNascimento;
        
        // Variável que pega o ano atual usando a classe Calendar
        int anoAtual = cal.get(Calendar.YEAR);
        
        // Variável para armazenar o resultado do cálculo de idade
        int idade;
        
        // Pede para o usuário digitar o ano de nascimento da pessoa
        System.out.println("Informe o ano do nascimento da pessoa: ");
        
        // Faz a leitura do ano digitado pelo usuário para a variável
        anoNascimento = leitura.nextInt();
        
        // Faz o cálculo de idade, subtraindo o ano de nascimento do ano atual
        idade = anoAtual - anoNascimento;
        
        // Mostra na tela a idade da pessoa
        System.out.println("A pessoa tem " + idade + " anos atualmente.");
    }    
}
