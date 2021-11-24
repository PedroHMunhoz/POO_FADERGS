package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Funcionario {

    public String nome;
    public String sobrenome;
    public int horasTrabalhadas;
    public float valorPorHora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public String nomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public float calcularSalario() {
        float salario = getHorasTrabalhadas() * getValorPorHora();
        return salario;
    }

    public void incrementarHoras(int numeroDeHoras) {
        int horasAtuais = getHorasTrabalhadas();
        setHorasTrabalhadas(horasAtuais + numeroDeHoras);
    }
}
