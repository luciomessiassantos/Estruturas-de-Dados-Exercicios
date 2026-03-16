package Exercises.Question01_02_03;

public class Pilha {

    private String[] elementos;
    private int tamanho;
    private int capacidade;

    public Pilha(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void empilha(String elemento) {
        if (this.tamanho == this.capacidade) {
            throw new RuntimeException("Pilha cheia");
        }
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public String desempilha() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        this.tamanho--;
        String removido = this.elementos[this.tamanho];
        this.elementos[this.tamanho] = null;
        return removido;
    }

    public String topo() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        String topo = this.elementos[this.tamanho - 1];
        return topo;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
