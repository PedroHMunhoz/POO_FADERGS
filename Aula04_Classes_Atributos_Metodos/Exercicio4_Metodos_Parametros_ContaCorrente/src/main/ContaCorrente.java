package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class ContaCorrente {

    public float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void definirSaldoInical(float saldoInicial) {
        setSaldo(saldoInicial);
    }

    public void depositar(float valorDeposito) {
        // Pega o saldo atual da conta
        float saldo = getSaldo();

        // Adiciona o valor depositado ao saldo atual
        saldo += valorDeposito;

        // Seta o saldo atual com o valor atualizado
        setSaldo(saldo);
    }

    public boolean sacar(float valorSaque) {
        float saldo = getSaldo();

        // Se o valor a sacar for maior que o saldo total, retorna um false
        if (valorSaque > saldo) {
            return false;
        }

        // Caso contrário, desconta o valor e retorna true
        saldo -= valorSaque;
        setSaldo(saldo);

        return true;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo atual da conta: R$ " + getSaldo());
    }
}
