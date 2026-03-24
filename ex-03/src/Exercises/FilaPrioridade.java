package Exercises;

import java.util.Comparator;

public class FilaPrioridade<T> {

    protected T[] elementos;
    protected int tamanho;
    protected int capacidade;
    protected Comparator<T> comparador;

    public FilaPrioridade(Comparator<T> comparador, int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
        this.capacidade = capacidade;
        this.comparador = comparador;
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public boolean isFull() {
        return this.tamanho == this.capacidade;
    }

    private void ordenar() {
        for (int i = 1; i < this.tamanho; i++) {
            T chave = this.elementos[i];
            int j = i - 1;
            while (j >= 0 && this.comparador.compare(this.elementos[j], chave) > 0) {
                this.elementos[j + 1] = this.elementos[j];
                j--;
            }
            this.elementos[j + 1] = chave;
        }
    }

    public void enqueue(T elemento) {
        if (isFull()) throw new IllegalStateException("Fila cheia");

        this.elementos[this.tamanho++] = elemento;
        ordenar();
    }

    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("Fila vazia");

        T elementoR = peek();

        for (int i = 0; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.elementos[--this.tamanho] = null;
        return elementoR;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Fila vazia");

        return this.elementos[0];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < this.tamanho; i++) {
            if (i == this.tamanho-1) {
                s.append(this.elementos[i]).append("]");
                break;
            }
            s.append(this.elementos[i]).append(", ");
        }
        return s.toString();
    }

    public int getTamanho() {
        return this.tamanho;
    }
}
