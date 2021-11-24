package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class TestarFuncionario {

    public static void main(String[] args) {
        // Cria um novo objeto da classe Funcionario
        Funcionario novoFuncionario = new Funcionario();

        // Seta o atributo Nome do objeto criado
        novoFuncionario.setNome("Luís");

        // Seta o atributo Sobrenome do objeto criado
        novoFuncionario.setSobrenome("Silva");

        // Seta o atributo horasTrabalhadas do objeto criado
        novoFuncionario.setHorasTrabalhadas(10);

        // Seta o atributo valorPorHora do objeto criado
        novoFuncionario.setValorPorHora((float) 25.50);

        // Busca e imprime o nome completo do funcionário recém criado
        String nomeCompleto = novoFuncionario.nomeCompleto();
        System.out.println("Nome: " + nomeCompleto);

        // Busca e imprime o salário do funcionário recém criado
        float salario = novoFuncionario.calcularSalario();
        System.out.println("Salário: R$ " + salario);

        // Incrementa a jornada de trabalho do funcionário em +8 horas
        novoFuncionario.incrementarHoras(8);

        // Busca e imprime o salário do funcionário, após reajuste de jornada
        salario = novoFuncionario.calcularSalario();
        System.out.println("Salário (após aumento da jornada): R$ " + salario);
    }
}
