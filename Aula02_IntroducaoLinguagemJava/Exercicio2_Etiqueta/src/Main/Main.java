package Main;

/**
 * @author Pedro Henrique Munhoz Costa
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Exercício 2 - Etiqueta 
         * Elabore um programa que escreve seu nome completo na primeira linha, 
         * seu endereço na segunda, e o CEP e telefone na terceira.
         */
        
        // Variáveis para armazenamento dos dados a serem impressos
        String nomeCompleto = "Roberval da Silva Souza";
        String enderecoCompleto = "Rua dos Bobos, nº 0 - Bairro Imaginação";
        String cep = "92123-456";
        String telefone = "(51) 98765-1234";

        // Imprime o nome
        System.out.println("Nome: " + nomeCompleto);
        
        // Imprime o Endereço
        System.out.println("Endereço: " + enderecoCompleto);
        
        // Imprime o CEP e Telefone
        System.out.println("CEP: " + cep + " | Telefone: " + telefone);
    }
}
