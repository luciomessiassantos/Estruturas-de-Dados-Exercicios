package Exercises.FilaDeSupermercado;

public class Cliente {

    protected String nome;
    protected int quantitade_produtos;

    public Cliente(String nome, int quantitade_produtos) {
        this.nome = nome;
        this.quantitade_produtos = quantitade_produtos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantitade_produtos() {
        return quantitade_produtos;
    }

    @Override
    public String toString() {
        return nome;
    }
}
