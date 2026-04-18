package Exercises.ListaDeConvidados;

import Exercises.ListaEncadeada;

public class TesteListaDeConvidados {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Ana - 123");
        lista.adiciona("Bruno - 321");
        lista.adiciona("Carlos - 456");
        lista.adiciona("Davi - 654");
        lista.adiciona("Eva - 789");
        lista.adiciona("Felipe - 987");

        System.out.println(lista);

        System.out.println("Contém Ana? "
                + lista.contem("Ana - 123"));
        System.out.println("Contém Lúcia? "
                + lista.contem("Lúcia - 999"));

        System.out.println("\nTotal: " + lista.getTamanho());

    }
}
