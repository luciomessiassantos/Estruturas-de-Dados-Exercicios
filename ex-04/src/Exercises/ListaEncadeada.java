package Exercises;

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

    public T pega(int indice) {
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