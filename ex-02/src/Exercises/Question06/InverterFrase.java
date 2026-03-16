package Exercises.Question06;

import Exercises.Question01_02_03.Pilha;

public class InverterFrase {

    public static void main(String[] args) {
        String frase = "eu gosto de java";
        Pilha pilha = new Pilha(100);

        for (String palavra : frase.split(" ")) {
            pilha.empilha(palavra);
        }

        StringBuilder resultado = new StringBuilder();
        while (!pilha.estaVazia()) {
            resultado.append(pilha.desempilha());
            if (!pilha.estaVazia()) resultado.append(" ");
        }

        System.out.println(resultado);
    }

}
