package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class NovoCliente {

    public static void main(String[] args) {
        // Objeto para leitura de dados do teclado
        Scanner leitura = new Scanner(System.in);

        // Variável para o nome do cliente digitado ao cadastrar
        String nome;

        // Variável para a escolha do menu
        int menuSelecionado = 0;

        // Variável para o número da conta a depositar/sacar
        int numeroConta = 0;

        // Variável de controle para mostrar mensagem caso não ache a conta digitada
        boolean achouConta = false;

        // Lista de Clientes cadastrados
        ArrayList<Cliente> listaClientesCadastrados = new ArrayList();

        do {
            // Reinicializa a variável de controle a cada passada do loop            
            achouConta = false;

            // Monta o menu para o usuário escolher
            System.out.println("########## GERENCIAMENTO DE CLIENTES ##########");
            System.out.println("1 - Cadastrar novo Cliente");
            System.out.println("2 - Depositar valores");
            System.out.println("3 - Sacar valores");
            System.out.println("4 - Exibir cadastro completo");
            System.out.println("5 - Sair");
            menuSelecionado = leitura.nextInt();

            // Chama a opção conforme o menu selecionado
            switch (menuSelecionado) {
                case 1: // Cadastrar cliente
                    // Solicita o nome do cliente
                    System.out.println("Informe o nome do cliente:");

                    // Limpeza de buffer
                    leitura.nextLine();

                    // Lê o nome para dentro da variável
                    nome = leitura.nextLine();

                    // Instancia um novo cliente e passa o nome como parâmetro
                    Cliente cliente = new Cliente(nome);

                    // Adiciona o objeto recém criado ao ArrayList de Clientes
                    listaClientesCadastrados.add(cliente);

                    // Imprime a mensagem de sucesso
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;
                case 2: // Depositar
                    if (listaClientesCadastrados.isEmpty()) {
                        // Informa que a lista está vazia
                        System.out.println("Não há clientes cadastrados!");
                    } else {
                        // Solicita o número da conta para depositar
                        System.out.println("Informe a conta na qual deseja depositar: ");

                        // Lê o número para a variável de controle
                        numeroConta = leitura.nextInt();

                        // Faz um loop procurando a conta dentro dos cadastros existentes
                        for (Cliente clienteLista : listaClientesCadastrados) {
                            if (clienteLista.getNumeroConta() == numeroConta) {
                                achouConta = true;
                                clienteLista.depositar();
                            }
                        }

                        if (!achouConta) {
                            System.out.println("Conta não encontrada. Verifique os dados e tente novamente.");
                        }
                    }
                    break;
                case 3: // Sacar
                    if (listaClientesCadastrados.isEmpty()) {
                        // Informa que a lista está vazia
                        System.out.println("Não há clientes cadastrados!");
                    } else {
                        // Solicita o número da conta para sacar
                        System.out.println("Informe a conta da qual deseja sacar: ");

                        // Lê o número para a variável de controle
                        numeroConta = leitura.nextInt();

                        // Faz um loop procurando a conta dentro dos cadastros existentes
                        for (Cliente clienteLista : listaClientesCadastrados) {
                            if (clienteLista.getNumeroConta() == numeroConta) {
                                achouConta = true;
                                clienteLista.sacar();
                            }
                        }

                        if (!achouConta) {
                            System.out.println("Conta não encontrada. Verifique os dados e tente novamente.");
                        }
                    }
                    break;
                case 4: // Exibir dados
                    if (listaClientesCadastrados.isEmpty()) {
                        // Informa que a lista está vazia
                        System.out.println("Não há clientes cadastrados!");
                    } else {
                        // Solicita o número da conta para buscar os dados
                        System.out.println("Informe a conta da qual deseja ver as informações: ");

                        // Lê o número para a variável de controle
                        numeroConta = leitura.nextInt();

                        // Faz um loop procurando a conta dentro dos cadastros existentes
                        for (Cliente clienteLista : listaClientesCadastrados) {
                            if (clienteLista.getNumeroConta() == numeroConta) {
                                achouConta = true;
                                clienteLista.exibirDados();
                            }
                        }

                        if (!achouConta) {
                            System.out.println("Conta não encontrada. Verifique os dados e tente novamente.");
                        }
                    }
                    break;
                case 5: // Sair
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (menuSelecionado != 5);
    }
}
