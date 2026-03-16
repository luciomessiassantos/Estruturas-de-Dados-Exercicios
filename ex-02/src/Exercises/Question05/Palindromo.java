package Exercises.Question05;

import Exercises.Question01_02_03.Pilha;

public class Palindromo {

    public static void main(String[] args) {
        verificar("arara");
        verificar("casa");
        verificar("hannah");
        verificar("carro");
    }

    static void verificar(String palavra) {
        Pilha pilha = new Pilha(100);

        for (char c : palavra.toCharArray()) {
            pilha.empilha(String.valueOf(c));
        }

        StringBuilder invertida = new StringBuilder();
        while (!pilha.estaVazia()) {
            invertida.append(pilha.desempilha());
        }

        if (palavra.equals(invertida.toString())) {
            System.out.println(palavra + " -> É palíndromo");
        } else {
            System.out.println(palavra + " -> Não é palíndromo");
        }

    }

}
