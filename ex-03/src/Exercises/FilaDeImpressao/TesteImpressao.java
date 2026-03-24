package Exercises.FilaDeImpressao;

import Exercises.Fila;

public class TesteImpressao {

    public static void main(String[] args) {

        Fila<Documento> fila = new Fila<>(5);

        Documento d1 = new Documento("Documento 1", 100);
        Documento d2 = new Documento("Documento 2", 70);
        Documento d3 = new Documento("Documento 3", 200);
        Documento d4 = new Documento("Documento 4", 140);
        Documento d5 = new Documento("Documento 5", 90);

        fila.enqueue(d1);
        fila.enqueue(d2);
        fila.enqueue(d3);
        fila.enqueue(d4);
        fila.enqueue(d5);

        System.out.println("== FILA DE IMPRESSÃO ==");
        System.out.println(fila);

        System.out.println("\n== DOCUMENTOS IMPRIMIDOS ==");
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());

        System.out.println("\n== FILA DE IMPRESSÃO ==");
        System.out.println(fila);

    }

}
