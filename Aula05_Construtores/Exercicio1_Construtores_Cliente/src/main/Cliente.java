package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Cliente {

    private String nome;
    private String endereco;
    private float renda;

    public Cliente() {
        System.out.println("Conta criada com sucesso!");
    }

    public Cliente(String nome, String endereco, float renda) {
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public void exibirNome() {
        System.out.println("Nome do Cliente: " + getNome());
        exibirEndereco();
    }

    private void exibirEndereco() {
        System.out.println("Endereço do Cliente: " + getEndereco());
    }

    public float exibirRenda() {
        float rendaAtual = getRenda();
        float limite = 0;

        if (rendaAtual <= 5000) {
            limite = 3000;
        } else if (rendaAtual <= 10000) {
            limite = 6000;
        } else {
            limite = rendaAtual * (float) 0.8;
        }
        
        System.out.println("Renda atual: R$ " + getRenda());

        return limite;
    }

}
