package main;
/**
 *
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    public static void main(String[] args) {
          /**
         * Exercício 5 - Tabela de Notas
         * Escreva um programa que produza a seguinte saída na tela:
         * 
         * ALUNO(A)     NOTA
         * =========    =====
         * ALINE        9.0
         * MÁRIO        DEZ
         * SÉRGIO       4.5
         * SHIRLEY      7.0
         * 
         * Obs: Nas strings foi utilizado o \t para dar um "TAB" entre as palavras
         * fazendo assim com que o espaçamento seja padrão entre elas e não
         * seja preciso utilizar o espaço para ficar ajustando
         */
          
          // Monta o cabeçalho com os títulos
          System.out.println("ALUNO(A)\tNOTA");
          
          // Monta o separador do cabeçalho
          System.out.println("=========\t=====");
          
          // Escreve os dados dos alunos
          System.out.println("ALINE\t\t9.0");
          System.out.println("MÁRIO\t\tDEZ");
          System.out.println("SÉRGIO\t\t4.5");
          System.out.println("SHIRLEY\t\t7.0");
    }
    
}
