package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */

public class Main {

    /**
    * Exercícios sobre operações matemáticas, leitura e escrita de dados
    * Exercício 5 - Uma loja está fazendo liquidação, vendendo tudo por 40% do 
    * preço original. Faça um programa em Java que calcule o valor do 
    * desconto, dado o preço original do produto.
    */
    public static void main(String[] args) {
        // Variável Scanner, pra leitura dos dados
        Scanner leitura = new Scanner(System.in);
        
        // Variavel para armazenar o percentual de desconto, 40% (40/100 = 0.4)
        float percDesconto = (float)0.4;
        
        // Variáveis para armazenar a leitura dos lados e o resultado
        float valorOriginalProduto;
        float valorDesconto;
        float valorTotal;
        
        // Solicita ao usuário o valor original do produto
        System.out.println("Digite o valor original do produto:");
        
        // Atribui o valor digitado à variável
        valorOriginalProduto = leitura.nextFloat();
        
        // Calcula o valor do desconto, multiplicando o valor original pelo 
        // percentua de desconto
        valorDesconto = valorOriginalProduto * percDesconto;
        
        // Calcula o valor total, subtraindo o desconto do valor original
        valorTotal = valorOriginalProduto - valorDesconto;
        
        // Mostra o valor do desconto para o usuário
        System.out.println("O valor do desconto para o produto é: " + valorDesconto);
        
        // Mostra o valor final do produto, após aplicação do desconto
        System.out.println("O preço final do produto é: " + valorTotal);    
    }    
}
