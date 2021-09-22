package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos de Repetição (WHILE, DO...WHILE, FOR) 
     * Exercício 2 - Escrever os números ímpares de 1 a 20.
     */
    public static void main(String[] args) {

        // Faz o loop de 1 até 20
        for (int i = 1; i <= 20; i++) {
            /**
             * Usando o operador % (mod) verificamos se o resto da divisão, pois
             * se ele for diferente de 0, indica que o número não é par, logo
             * ele é ímpar.
             */
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
