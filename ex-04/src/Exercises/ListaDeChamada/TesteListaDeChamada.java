package Exercises.ListaDeChamada;

import Exercises.ListaEncadeada;

public class TesteListaDeChamada {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Ana - 1");
        lista.adiciona("Bruno - 2");
        lista.adiciona("Carlos - 3");
        lista.adiciona("Davi - 4");
        lista.adiciona("Eva - 5");

        System.out.println("Lista:");
        System.out.println(lista);

        System.out.println("Primeiro: " + lista.pegaPrimeiro());
        System.out.println("Último: " + lista.pegaUltimo());
        System.out.println("Total: " + lista.getTamanho());

    }
}