package Exercises.ListaDeCompras;

import Exercises.ListaEncadeada;

public class TesteListaDeCompras {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Arroz - 2");
        lista.adiciona("Feijão - 1");
        lista.adiciona("Leite - 3");
        lista.adiciona("Pão - 10");
        lista.adiciona("Café - 1");
        lista.adiciona("Açúcar - 2");
        lista.adiciona("Óleo - 1");

        System.out.println(lista);

        System.out.println("Item na posição 2: " + lista.pega(2));

        System.out.println("\nContém 'Arroz - 2'? "
                + lista.contem("Arroz - 2"));
        System.out.println("Contém 'Pastel - 53'? "
                + lista.contem("Pastel - 53"));

        System.out.println("\nTotal: " + lista.getTamanho());

    }
}