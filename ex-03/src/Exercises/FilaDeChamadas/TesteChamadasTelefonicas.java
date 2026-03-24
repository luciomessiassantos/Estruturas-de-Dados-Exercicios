package Exercises.FilaDeChamadas;

import Exercises.Fila;

public class TesteChamadasTelefonicas {

    public static void main(String[] args) {

        Fila<Chamada> fila = new Fila<>(10);

        Chamada c1 = new Chamada("Jonas", "Parente visitando");
        Chamada c2 = new Chamada("José", "Passear cachorro");
        Chamada c3 = new Chamada("Judas", "Conversar");
        Chamada c4 = new Chamada("João", "Dados bancários");
        Chamada c5 = new Chamada("John", "Ração do gato");

        fila.enqueue(c1);
        fila.enqueue(c2);
        fila.enqueue(c3);
        fila.enqueue(c4);
        fila.enqueue(c5);

        System.out.println("== FILA DE CHAMADAS ==");
        System.out.println(fila);

        System.out.println("\n== CHAMADAS ATENDIDAS ==");
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());

        System.out.println("\n== CHAMADA ATUAL ==");
        System.out.println(fila.peek());

        System.out.println("\n== CHAMADAS RESTANTES ==");
        System.out.println(fila);

    }

}
