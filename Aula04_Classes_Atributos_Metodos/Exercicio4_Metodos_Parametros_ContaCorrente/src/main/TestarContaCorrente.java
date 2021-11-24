package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class TestarContaCorrente {

    public static void main(String[] args) {
        // Cria um novo objeto da classe ContaCorrente
        ContaCorrente novaConta = new ContaCorrente();

        // Variável de controle para verificar se o saque foi bem sucedido ou não
        boolean saqueEfetuado = false;

        // Define o saldo inicial da conta em R$1000
        novaConta.definirSaldoInical(1000);

        // Escreve o valor do saldo da conta
        novaConta.imprimirSaldo();

        // Tenta realizar um saque de R$500 e verifica se conseguiu
        saqueEfetuado = novaConta.sacar(500);

        // Se não conseguiu executar o saque, printa o aviso na tela
        if (!saqueEfetuado) {
            System.out.println("Saldo insuficiente para a operação!");
        } else {

            // Realiza um depósito de R$50
            novaConta.depositar(50);

            // Escreve o valor do saldo da conta
            novaConta.imprimirSaldo();

            // Tenta realizar um saque de R$600
            saqueEfetuado = novaConta.sacar(600);

            if (!saqueEfetuado) {
                System.out.println("Saldo insuficiente para a operação!");
            }

            // Escreve o valor do saldo da conta
            novaConta.imprimirSaldo();
        }
    }
}
