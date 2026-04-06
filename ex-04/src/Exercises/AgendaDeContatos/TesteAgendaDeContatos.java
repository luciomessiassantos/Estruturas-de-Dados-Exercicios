package Exercises.AgendaDeContatos;

import Exercises.ListaEncadeada;

public class TesteAgendaDeContatos {
    public static void main(String[] args) {

        ListaEncadeada<String> agenda = new ListaEncadeada<>();

        agenda.adiciona("Ana - 9999");
        agenda.adiciona("Bruno - 8888");
        agenda.adiciona("Carlos - 7777");
        agenda.adiciona("Davi - 6666");
        agenda.adiciona("Eva - 5555");
        agenda.adiciona("Felipe - 4444");

        System.out.println(agenda);

        System.out.println("Contém Ana? "
                + agenda.contem("Ana - 9999"));
        System.out.println("Contém Lúcia? "
                + agenda.contem("Lúcia - 9999"));


        System.out.println("\nTotal: " + agenda.getTamanho());

    }
}
