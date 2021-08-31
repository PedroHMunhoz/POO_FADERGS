package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */

public class Main {

    /**
    * Exercícios sobre operações matemáticas, leitura e escrita de dados
    * Exercício 4 - Calcular e mostrar o valor do perímetro de um retângulo 
    * dado o valor dos dois lados. O perímetro do retângulo é calculado 
    * pela fórmula perimetroRetangulo = 2*lado1 + 2*lado2.
    */
    public static void main(String[] args) {
         // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);
        
        // Variáveis para armazenar a leitura dos lados e o resultado
        float lado1;
        float lado2;
        float perimetroRetangulo;
        
        // Solicita ao usuário o valor do primeiro lado
        System.out.println("Digite o valor do Lado 1 do retângulo:");
        
        // Atribui o valor digitado à variável
        lado1 = leitura.nextFloat();
        
        // Solicita ao usuário o valor do segundo lado
        System.out.println("Digite o valor do Lado 2 do retângulo:");
        
        // Atribui o valor digitado à variável
        lado2 = leitura.nextFloat();
        
        // Calcula o perímetro do retângulo, conforme a fórmula
        perimetroRetangulo = (2 * lado1) + (2 * lado2);
        
        // Exibe o resultado na tela
        System.out.println("O perímetro do retângulo é " + perimetroRetangulo);
    }    
}
