package Main;

/**
 * @author Pedro Henrique Munhoz Costa
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Exercício 3 - Quadrado na Tela 
         * Implemente um programa que desenhe um Quadrado na tela
         */

        // Desenha a parte de cima do quadrado
        System.out.println("* * * * * * * * * *");

        // Desenha os lados do quadrado, usando um loop FOR pra escrevar várias
        // vezes a mesma linha de código
        for (int i = 0; i < 6; i++) {
            System.out.println("*                 *");
        }
        
        // Desenha a parte de baixo do quadrado
        System.out.println("* * * * * * * * * *");
    }
}
