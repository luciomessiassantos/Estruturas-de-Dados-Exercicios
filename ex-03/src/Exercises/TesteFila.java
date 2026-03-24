package Exercises;

import Exercises.ProntoSocorro.Paciente;

public class TesteFila {

    public static void main(String[] args) {

        Fila fila = new Fila<>(10);

        Paciente p1 = new Paciente("Jonas", 2);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(p1);
        fila.enqueue(001);
        fila.enqueue(0.01);
        fila.enqueue("Casa");

        System.out.println("== LISTA DE ELEMENTOS ==");
        System.out.println(fila);

        System.out.println("\n== ELEMENTOS RETIRADOS ==");
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());

        System.out.println("\n== ELEMENTOS RESTANTES ==");
        System.out.println(fila);

        System.out.println("\n== PRIMEIRO ELEMENTO ==");
        System.out.println(fila.peek());

    }

}
