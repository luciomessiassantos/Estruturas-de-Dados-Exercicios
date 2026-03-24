package Exercises.Banco;


import Exercises.Fila;

public class Main {
    public static void main(String[] args) {
        Fila<Cliente> filaBanco = new Fila<>(7);
        var c1 = new Cliente("Marcio", 1);
        var c2 = new Cliente("Marcio1", 2);
        var c3 = new Cliente("Marcio2", 3);
        var c4 = new Cliente("Marcio3", 4);
        var c5 = new Cliente("Marcio4", 5);
        var c6 = new Cliente("Marcio5", 6);

        filaBanco.enqueue(c1);
        filaBanco.enqueue(c2);
        filaBanco.enqueue(c3);
        filaBanco.enqueue(c4);
        filaBanco.enqueue(c5);
        filaBanco.enqueue(c6);

        System.out.println(filaBanco.dequeue().getSenha());
        System.out.println(filaBanco.dequeue().getSenha());
        System.out.println(filaBanco.dequeue().getSenha());
        System.out.println(filaBanco.dequeue().getSenha());
        System.out.println(filaBanco.dequeue().getSenha());
        System.out.println(filaBanco.dequeue().getSenha());

        System.out.println(filaBanco);
        System.out.println("Fila Vazia");

    }
}
