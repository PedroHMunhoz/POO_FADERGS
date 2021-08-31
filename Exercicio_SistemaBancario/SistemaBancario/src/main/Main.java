package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    public static void main(String[] args) {
        // Senha de acesso do usuário
        final String senhaUsuario = "1234";

        // Variável para a leitura do usuário
        Scanner leitura = new Scanner(System.in);

        // Variável para a senha que foi digitada pelo usuário
        String senhaDigitada;

        // Número máximo de tentativas de acesso
        int tentativas = 3;

        // Variável para controlar se a senha foi digitada corretamente
        Boolean senhaCorreta = false;

        // Variável para a opção selecionada no menu de opções
        int opcaoMenu = 0;

        // Nome do Cliente, para o cadastro e exibição
        String nomeCliente = "";

        // Número da Conta do Cliente, para o cadastro e exibição
        int numeroConta = 0;

        // Variável para o valor depositado na conta
        float valorDeposito = 0;

        // Variável para o valor a ser sacado da conta
        float valorSaque = 0;

        // Variável para armazenar o saldo total da conta
        float valorSaldo = 0;

        // Enquanto houverem tentativas restantes, pede o input do usuário
        while (tentativas > 0) {

            // Pede a senha e faz a leitura da mesma
            System.out.println("Digite a senha do usuário para acessar o sistema:");
            senhaDigitada = leitura.nextLine();

            // Se a senha estiver incorreta, avisa o usuário e informa a quantidade
            // de tentativas restantes
            if (!senhaDigitada.equals(senhaUsuario)) {
                tentativas--;
                System.out.println("Senha incorreta. Tente novamente! Tentativas restantes: " + tentativas);
            } else {
                // Se acertar, marca a flag de senha correta e sai do loop
                senhaCorreta = true;
                break;
            }
        }

        // Se a senha não foi digitada corretamente, mostra mensagem
        if (!senhaCorreta) {
            System.out.println("Tentativas excedidas! O programa será fechado.");
        } else {
            // Senão, exibe o menu de opções

            // Enquanto a opção digitada for diferente de 5, que é o Sair
            while (opcaoMenu != 5) {
                System.out.println("\n########## MENU DE OPÇÕES ##########");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Extrato");
                System.out.println("5. Sair\n");

                // Atribiu o valor digitado pelo usuário
                opcaoMenu = leitura.nextInt();

                // O Switch/Case define qual opção será acessada baseada no
                // valor informado pelo usuário
                switch (opcaoMenu) {
                    case 1:
                        // Mostra o cabeçalho do menu
                        System.out.println("########## CADASTRAR CLIENTE ##########");

                        // Pede pro usuário informar o nome do cliente
                        System.out.println("Informe o nome do cliente:");
                        nomeCliente = leitura.next();
                        leitura.nextLine(); // Limpa buffer

                        // Pede pro usuário informar o número da conta
                        System.out.println("Informe o número da conta: ");
                        numeroConta = leitura.nextInt();

                        // Mensagem de sucesso
                        System.out.println("Cliente cadastrado com sucesso!");
                        break;
                    case 2:

                        // Validação de cliente, se não tiver nenhum cadastrado,
                        // não permite acessar essa opção pois ela depende do cliente
                        if (nomeCliente.equals("")) {
                            System.out.println("Nenhum cliente cadastrado! Cadastre um cliente para usar o banco.");
                            break;
                        }

                        // Mostra o cabeçalho do menu
                        System.out.println("########## DEPOSITAR ##########");

                        while (valorDeposito <= 0) {
                            // Pede para o cliente informar o valor a ser depositado
                            System.out.println("Informe o valor do depósito:");
                            valorDeposito = leitura.nextFloat();

                            // Se o valor for negativo ou zero, será inválido
                            if (valorDeposito <= 0) {
                                System.out.println("Valor inválido! O valor deve "
                                        + "ser maior do que zero!");
                            }
                        }

                        // Soma o valor informado ao saldo da conta
                        valorSaldo += valorDeposito;

                        // Mensagem de sucesso
                        System.out.println("Valor depositado com sucesso!");
                        break;
                    case 3:

                        // Validação de cliente, se não tiver nenhum cadastrado,
                        // não permite acessar essa opção pois ela depende do cliente
                        if (nomeCliente.equals("")) {
                            System.out.println("Nenhum cliente cadastrado! Cadastre um cliente para usar o banco.");
                            break;
                        }

                        // Mostra o cabeçalho do menu
                        System.out.println("########## SACAR ##########");

                        while (valorSaque <= 0) {
                            // Pede para o cliente informar o valor a ser sacado
                            System.out.println("Informe o valor do saque:");
                            valorSaque = leitura.nextFloat();

                            // Se o valor for negativo ou zero, será inválido
                            if (valorSaque <= 0) {
                                System.out.println("Valor inválido! O valor deve "
                                        + "ser maior do que zero!");
                            }
                        }

                        // Valida se tem saldo suficiente para executar o saque
                        // Se tiver saldo suficiente, subtrai o valor do saldo
                        // total da conta
                        if (valorSaldo - valorSaque > 0) {
                            valorSaldo -= valorSaque;

                            // Mensagem de sucesso
                            System.out.println("Valor sacado com sucesso!");
                        } else {
                            // Se não tiver saldo suficiente, dá mensagem para o
                            // cliente informando o saldo total atual
                            System.out.println("O saldo é insuficiente para essa operação!");
                            System.out.println("Saldo atual: " + valorSaldo);                            
                        }
                        break;
                    case 4:

                        // Validação de cliente, se não tiver nenhum cadastrado,
                        // não permite acessar essa opção pois ela depende do cliente
                        if (nomeCliente.equals("")) {
                            System.out.println("Nenhum cliente cadastrado! Cadastre um cliente para usar o banco.");
                            break;
                        }

                        // Mostra o cabeçalho do menu
                        System.out.println("########## EXTRATO ##########");

                        // Exibe os dados do cliente cadastrado e seu saldo atual
                        System.out.println("Nome do Cliente: " + nomeCliente);
                        System.out.println("Número da Conta: " + numeroConta);
                        System.out.println("Saldo da Conta: " + valorSaldo);
                        break;
                    case 5:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        // Se for digtada alguma opção inválida, cai nesse case
                        System.out.println("Opção inválida!");
                        break;
                }
            }
        }
    }
}
