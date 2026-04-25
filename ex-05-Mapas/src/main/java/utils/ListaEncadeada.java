package utils;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public void adiciona(T valor) {
        No<T> novo = new No<>(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            fim.setProximo(novo);
        }
        fim = novo;

        tamanho++;
    }

    private No<T> buscaPorNo(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        No<T> noAtual = this.inicio;

        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T pegaPrimeiro() {
        if (inicio == null) {
            throw new RuntimeException("Lista vazia");
        }
        return inicio.getValor();
    }

    public T pegaUltimo() {
        if (fim == null) {
            throw new RuntimeException("Lista vazia");
        }
        return fim.getValor();
    }

    private No<T> buscaNoPorPosicao(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        No<T> atual = inicio;

        for (int i = 0; i < indice; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    public T buscaPorPosicao(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        No<T> atual = inicio;

        for (int i = 0; i < indice; i++) {
            atual = atual.getProximo();
        }

        return atual.getValor();
    }

    public boolean contem(T valor) {
        No<T> atual = inicio;

        while (atual != null) {
            if (atual.getValor().equals(valor)) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }

    public T removeInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException("A lista está vazia");
        }

        T removido = this.inicio.getValor();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0) {
            this.fim = null;
        }
        return removido;
    }

    public T removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("A lista está vazia");
        }
        if (this.tamanho == 1) {
            this.removeInicio();
        }
        No<T> penultimoNo = this.buscaPorNo(this.tamanho - 2);
        T removido = penultimoNo.getProximo().getValor();

        penultimoNo.setProximo(null);
        this.fim = penultimoNo;
        this.tamanho--;
        return removido;
    }


    public T removePorPosicao(int i) {

        if (i < 0 || i >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if (i == 0) {
            return this.removeInicio();
        }
        if (i == tamanho - 1) {
            return this.removeFinal();
        }
        No<T> noAnterior = this.buscaPorNo(i - 1);
        No<T> atual = noAnterior.getProximo();
        No<T> proximo = atual.getProximo();

        noAnterior.setProximo(proximo);
        atual.setProximo(null);
        this.tamanho--;

        return atual.getValor();
    }


    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> atual = inicio;

        while (atual != null) {
            sb.append(atual.getValor()).append("\n");
            atual = atual.getProximo();
        }

        return sb.toString();
    }


}