package Exercises.VagasDeEstacionamento;

import Exercises.ListaEncadeada;

public class TesteVagasDeEstacionamento {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("ABC-1234 - Gol");
        lista.adiciona("DEF-5678 - Uno");
        lista.adiciona("GHI-9012 - Civic");
        lista.adiciona("JKL-3456 - Corolla");
        lista.adiciona("MNO-7890 - HB20");

        System.out.println(lista);

        System.out.println("Contém ABC-1234? "
                + lista.contem("ABC-1234 - Gol"));
        System.out.println("Contém ABC-3214? "
                + lista.contem("ABC-3214 - Porsche"));

        System.out.println("\nPrimeiro: " + lista.pegaPrimeiro());
        System.out.println("Último: " + lista.pegaUltimo());

    }
}
