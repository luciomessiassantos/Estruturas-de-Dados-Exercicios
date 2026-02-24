package org.example;

public class Main {
    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.TesteVetor1();
        teste.TesteVetor2();
        try {
            teste.TesteVetor3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        teste.TesteVetor4();
        teste.TesteVetor5();

        teste.testeVetor6();

    }
}