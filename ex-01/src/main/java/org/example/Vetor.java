package org.example;

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



}
