package Exercises.BoletimDeNotas;

import Exercises.ListaEncadeada;

public class TesteBoletimDeNotas {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Matemática - 8.5");
        lista.adiciona("Português - 7.0");
        lista.adiciona("História - 9.0");
        lista.adiciona("Geografia - 6.5");
        lista.adiciona("Física - 8.0");

        System.out.println(lista);

        System.out.println("Posição 1: " + lista.pega(1));

        System.out.println("\nContém Matemática? "
                + lista.contem("Matemática - 8.5"));
        System.out.println("Contém Cálculo I? "
                + lista.contem("Cálculo I - 2.2"));

        System.out.println("\nTotal: " + lista.getTamanho());

    }
}
