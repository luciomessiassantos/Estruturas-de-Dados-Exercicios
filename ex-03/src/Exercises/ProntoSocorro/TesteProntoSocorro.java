package Exercises.ProntoSocorro;

import Exercises.FilaPrioridade;

import java.util.Comparator;

public class TesteProntoSocorro {

    public static void main(String[] args) {

        FilaPrioridade<Paciente> fila = new FilaPrioridade<>(
                Comparator.comparing(Paciente::getPrioridade), 10
        );

        Paciente p1 = new Paciente("Jonas", 1);
        Paciente p2 = new Paciente("Judas", 2);
        Paciente p3 = new Paciente("José", 1);
        Paciente p4 = new Paciente("João", 3);
        Paciente p5 = new Paciente("John", 2);
        Paciente p6 = new Paciente("Joseph", 3);

        // Por ordem de inserção seria:
        // Jonas, Judas, José, João, John, Joseph

        fila.enqueue(p1);
        fila.enqueue(p2);
        fila.enqueue(p3);
        fila.enqueue(p4);
        fila.enqueue(p5);
        fila.enqueue(p6);

        System.out.println("== FILA DE ESPERA ==");
        System.out.println(fila);

        System.out.println("\n== PACIENTES ATENDIDOS ==");
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());

        System.out.println("\n== FILA DE ESPERA ==");
        System.out.println(fila);

    }

}
