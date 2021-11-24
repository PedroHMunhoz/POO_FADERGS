package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class TestarCliente {

    public static void main(String[] args) {
        // Instancia um objeto Cliente, com o construtor vazio
        Cliente clienteVazio = new Cliente();

        // Exibe o nome e endereço do cliente criado com o construtor vazio
        clienteVazio.exibirNome();
        
        // Exibe a renda do cliente criado com o construtor vazio
        clienteVazio.exibirRenda();

        // Instancia um objeto Cliente, com o construtor preenchido
        Cliente clientePreenchido = new Cliente("José Silveira", "Rua das Catanduvas, 1000", 3000);

        // Exibe o nome e endereço do cliente criado com o construtor preenchido
        clienteVazio.exibirNome();
        
        // Exibe a renda do cliente criado com o construtor preenchido
        clienteVazio.exibirRenda();clientePreenchido.exibirNome();
        clientePreenchido.exibirRenda();
    }

}
