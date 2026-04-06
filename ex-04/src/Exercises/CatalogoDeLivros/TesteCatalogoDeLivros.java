package Exercises.CatalogoDeLivros;

import Exercises.ListaEncadeada;

public class TesteCatalogoDeLivros {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Livro A - Autor X - 2020");
        lista.adiciona("Livro B - Autor Y - 2019");
        lista.adiciona("Livro C - Autor Z - 2018");
        lista.adiciona("Livro D - Autor W - 2021");
        lista.adiciona("Livro E - Autor K - 2022");

        System.out.println(lista);

        System.out.println("Primeiro: " + lista.pegaPrimeiro());
        System.out.println("Último: " + lista.pegaUltimo());

    }
}