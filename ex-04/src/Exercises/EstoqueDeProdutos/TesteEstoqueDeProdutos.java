package Exercises.EstoqueDeProdutos;

import Exercises.ListaEncadeada;

public class TesteEstoqueDeProdutos {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Produto A - 10.0 - 5");
        lista.adiciona("Produto B - 20.0 - 3");
        lista.adiciona("Produto C - 30.0 - 7");
        lista.adiciona("Produto D - 40.0 - 2");
        lista.adiciona("Produto E - 50.0 - 1");

        System.out.println(lista);

        System.out.println("Posição 2: " + lista.pega(2));

        System.out.println("Contém Produto A? "
                + lista.contem("Produto A - 10.0 - 5"));
        System.out.println("Contém Produto F? "
                + lista.contem("Produto F - 5.0 - 5"));

        System.out.println("\nPrimeiro: " + lista.pegaPrimeiro());
        System.out.println("Último: " + lista.pegaUltimo());

    }
}
