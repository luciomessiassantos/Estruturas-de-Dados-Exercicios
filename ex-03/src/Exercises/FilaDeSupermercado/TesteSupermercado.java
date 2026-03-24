package Exercises.FilaDeSupermercado;

import Exercises.Fila;

public class TesteSupermercado {

    public static void main(String[] args) {

        Fila<Cliente> fila = new Fila<>(10);

        Cliente c1 = new Cliente("Jonas", 2);
        Cliente c2 = new Cliente("João", 5);
        Cliente c3 = new Cliente("Judas", 8);
        Cliente c4 = new Cliente("John", 1);
        Cliente c5 = new Cliente("José", 4);

        fila.enqueue(c1);
        fila.enqueue(c2);
        fila.enqueue(c3);
        fila.enqueue(c4);
        fila.enqueue(c5);

        System.out.println("== FILA DE CLIENTES ==");
        System.out.println(fila);

        System.out.println("\n== CLIENTES ATENDIDOS ==");
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());

        System.out.println("\n== CLIENTE ATUAL ==");
        System.out.println(fila.peek());

        System.out.println("\n== CLIENTES RESTANTES ==");
        System.out.println(fila);

    }

}
