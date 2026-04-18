package Exercises;

public class TesteListaEncadeada {
    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista);
        System.out.println("Primeiro: " + lista.pegaPrimeiro());
        System.out.println("Último: " + lista.pegaUltimo());
        System.out.println("Posição 1: " + lista.pega(1));
        System.out.println("Contém B? " + lista.contem("B"));
        System.out.println("Tamanho: " + lista.getTamanho());

    }
}
