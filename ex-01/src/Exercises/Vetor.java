package Exercises;

public class Vetor {

    private String[] elementos;

    private int tamanho;

    public Vetor(int capacidade) {
        this.tamanho = 0;
        this.elementos = new String[capacidade];
    }

    public void adicionar(String el) {
        if (this.tamanho == elementos.length) {
            throw new IllegalStateException("o vetor está cheio");
        }
        this.elementos[this.tamanho++] = el;
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public String ultimo() {
        if (estaVazia()) {
            throw new IllegalStateException("o vetor está vazio");
        }
        return elementos[tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public boolean contem(String elemento) {
        for (String e : this.elementos) {
            if (elemento.equals(e)) {
                return true;
            }
        }

        return false;
    }

    public int getTamanho() {
        return this.tamanho;
    }


    public void limpar() {
        if (estaVazia()) {
            return;
        }
        for (int i = this.tamanho - 1; i >= 0; i--) {
            this.elementos[i] = null;
        }
        System.out.println("Lista limpa");
    }

    public int contarOcorrencias(String elemento) {
        int contador = 0;
        for (String e : this.elementos) {
            if (e.equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

    public boolean substituir(String antigo, String novo) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(antigo)) {
                this.elementos[i] = novo;
                return true;
            }
        }

        return false;
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao > this.elementos.length) {
            throw new IllegalArgumentException("Índice inválido");
        }

        // remoção

        this.elementos[posicao] = null;

        // deslocamento de elementos
        for (int i = posicao; i < this.tamanho; i++) {
            this.elementos[i] = this.elementos[i + 1];

        }
        // Decremento do tamanho
        this.tamanho--;
    }


    public boolean remove(String elemento) {
        int pos = this.busca(elemento);
        if (pos < 0) return false;
        this.remove(pos);
        return true;
    }


    public int indiceUltimo(String el) {
        for (int j = this.tamanho - 1; j >= 0; j--) {
            if (el.equals(this.elementos[j])) return j;
        }

        return -1;
    }

    public void removerTodos(String elemento) {
        while (remove(elemento)) {}
    }

    public boolean adicionarSeNaoExiste(String elemento) {
        if (busca(elemento) == -1) {
            this.adicionar(elemento);
            return true;
        }

        return false;
    }


    public boolean inserirDepois(String referencia, String elemento) {
        if (this.tamanho == this.elementos.length) return false;
        int referenciaPosicao = this.busca(referencia);

        if (referenciaPosicao < 0) return false;

        for (int r = this.tamanho - 1; r > referenciaPosicao; r--) {
            this.elementos[r + 1] = this.elementos[r];
        }

        this.elementos[referenciaPosicao + 1] = elemento;
        this.tamanho++;
        return true;
    }
}
