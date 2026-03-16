package Exercises.Question04;

import Exercises.Question01_02_03.Pilha;

public class InverterPalavra {

    public static void main(String[] args) {
        String palavra = "hello";
        Pilha pilha = new Pilha(100);

        for (char c : palavra.toCharArray()) {
            pilha.empilha(String.valueOf(c));
        }

        StringBuilder invertida = new StringBuilder();
        while (!pilha.estaVazia()) {
            invertida.append(pilha.desempilha());
        }

        System.out.println(invertida);

    }

}
