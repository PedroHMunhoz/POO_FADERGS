package main;

import java.util.Scanner;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Cliente {

    private String nome;
    private int numeroConta;
    private float saldo;
    private float limite;
    private static int auxConta;

    // Para a leitura de dados do teclado
    Scanner leitura = new Scanner(System.in);

    public Cliente(String nomeCliente) {
        this.nome = nomeCliente;
        this.saldo = 0;
        this.limite = 0;
        this.numeroConta = gerarNumeroConta();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void exibirDados() {
        float saldo = getSaldo();
        float limiteDisponivel = verificarLimite(saldo);

        System.out.println("########## INFORMAÇÕES DA CONTA ##########");
        System.out.println("Nome do Cliente: " + getNome());
        System.out.println("Saldo: R$ " + saldo);

        if (saldo > 0) {
            System.out.println("Saldo positivo!");
        } else {
            System.out.println("Saldo negativo!");
        }

        System.out.println("Limite disponível: R$ " + limiteDisponivel);
    }

    public void sacar() {

        // Variável para ler o valor que o usuário quer sacar
        float valorSaque = 0;

        // Pega o saldo atual do cliente
        float saldo = getSaldo();

        // Enquato o valor do deposito for menor ou igual a 0, solicita para o usuário
        while (valorSaque <= 0) {
            // Pede o valor a ser sacado pelo usuário
            System.out.println("Informe o valor do saque: ");

            // Lê o valor para a variável
            valorSaque = leitura.nextFloat();

            // Valida se o valor é menor ou igual a zero, para exibir a mensagem de alerta
            if (valorSaque <= 0) {
                System.out.println("Valor inválido! O valor deve ser maior do que zero!");
            }
        }

        // Se tiver saldo para fazer o saque, atualiza o saldo e mostra mensagem de sucesso
        if (valorSaque < saldo) {
            // Deduz do saldo atual o valor sacado        
            saldo -= valorSaque;

            // Seta a propriedade Saldo com o novo valor
            setSaldo(saldo);

            // Imprime a mensagem de sucesso
            System.out.println("Saque realizado com sucesso!");
        } else {
            // Mostra a mensagem de saldo insuficiente
            System.out.println("Saldo insuficiente para a operação!");
        }
    }

    public void depositar() {
        // Variável para ler o valor que o usuário quer depositar
        float valorDeposito = 0;

        // Pega o saldo atual do cliente
        float saldo = getSaldo();

        // Enquato o valor do deposito for menor ou igual a 0, solicita para o usuário
        while (valorDeposito <= 0) {

            // Pede o valor a ser depositado pelo usuário
            System.out.println("Informe o valor do depósito: ");

            // Lê o valor para a variável
            valorDeposito = leitura.nextFloat();

            // Valida se o valor é menor ou igual a zero, para exibir a mensagem de alerta
            if (valorDeposito <= 0) {
                System.out.println("Valor inválido! O valor deve ser maior do que zero!");
            }
        }

        // Soma no saldo atual o valor depositado        
        saldo += valorDeposito;

        // Seta a propriedade Saldo com o novo valor
        setSaldo(saldo);

        // Imprime a mensagem de sucesso
        System.out.println("Crédito realizado com sucesso!");
    }

    private float verificarLimite(float saldo) {
        // Variável para armazenar o limite calculado
        float limite = 0;

        // Faz a regra do cálculo de limite, conforme o saldo
        if (saldo <= 2000.00) {
            limite = saldo * 0.3f;
        } else if (saldo < 5000.00) {
            limite = saldo * 0.5f;
        } else {
            limite = saldo * 0.7f;
        }

        // Retorna o limite calculado
        return limite;
    }

    private static int gerarNumeroConta() {
        int numeroConta = ++auxConta;
        return numeroConta;
    }
}
