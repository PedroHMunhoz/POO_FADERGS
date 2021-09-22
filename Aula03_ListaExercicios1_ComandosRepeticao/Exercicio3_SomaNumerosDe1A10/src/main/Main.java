package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * Exercícios sobre Comandos de Repetição (WHILE, DO...WHILE, FOR) 
     * Exercício 3 - Calcular a soma dos números de 1 a 10.
     */
    public static void main(String[] args) {
        int soma = 0;

        // Faz o loop de 1 até 10
        for (int i = 1; i <= 10; i++) {
            
            // Somamos o valor da variável soma com o iterador atual
            soma += i;
        }
        
        // Imprimir a soma feita dentro do loop
        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }

}
