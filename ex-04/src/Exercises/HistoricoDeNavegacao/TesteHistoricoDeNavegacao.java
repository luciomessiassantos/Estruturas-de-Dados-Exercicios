package Exercises.HistoricoDeNavegacao;

import Exercises.ListaEncadeada;

public class TesteHistoricoDeNavegacao {
    public static void main(String[] args) {

        ListaEncadeada<String> historico = new ListaEncadeada<>();

        historico.adiciona("Google - google.com");
        historico.adiciona("YouTube - youtube.com");
        historico.adiciona("GitHub - github.com");
        historico.adiciona("StackOverflow - stackoverflow.com");
        historico.adiciona("UOL - uol.com");
        historico.adiciona("Globo - globo.com");
        historico.adiciona("Twitter - twitter.com");
        historico.adiciona("Instagram - instagram.com");

        System.out.println(historico);

        System.out.println("Contém Google? "
                + historico.contem("Google - google.com"));
        System.out.println("Contém Facebook? "
                + historico.contem("Google - facebook.com"));

        System.out.println("\nÚltimo: " + historico.pegaUltimo());
        System.out.println("Total: " + historico.getTamanho());

    }
}