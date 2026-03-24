package Exercises;

public class Fila<T> {
    protected T[] elementos;
    protected int tamanho;
    protected int capacidade;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i <= this.tamanho - 1; i++) {
            if (i == this.tamanho - 1) {
                s.append(this.elementos[i]).append("]");
                break;
            }
            s.append(this.elementos[i]).append(", ");
        }

        return s.toString();
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public boolean isFull() {
        return this.tamanho == this.capacidade;
    }

    public void enqueue(T elemento) {
        if (isFull()) throw new IllegalStateException("Fila cheia");

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
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

}