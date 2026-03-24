package Exercises.AgendamentoDeTarefas;

import Exercises.FilaPrioridade;

import java.util.Comparator;

public class TesteTarefasDoSistema {

    public static void main(String[] args) {

        FilaPrioridade<Tarefa> fila = new FilaPrioridade<>(
                Comparator.comparing(Tarefa::getPrioridade), 10
        );

        Tarefa t1 = new Tarefa("Tarefa 01", 1);
        Tarefa t2 = new Tarefa("Tarefa 02", 2);
        Tarefa t3 = new Tarefa("Tarefa 03", 3);
        Tarefa t4 = new Tarefa("Tarefa 04", 1);
        Tarefa t5 = new Tarefa("Tarefa 05", 3);
        Tarefa t6 = new Tarefa("Tarefa 06", 2);

        // Por ordem de inserção seria:
        // Tarefa 01, Tarefa 02, Tarefa 03, Tarefa 04, Tarefa 05, Tarefa 06

        fila.enqueue(t1);
        fila.enqueue(t2);
        fila.enqueue(t3);
        fila.enqueue(t4);
        fila.enqueue(t5);
        fila.enqueue(t6);

        System.out.println("== TAREFAS ENFILEIRADAS ==");
        System.out.println(fila);

        System.out.println("\n== TAREFAS REALIZADAS ==");
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());

        System.out.println("\n== TAREFA ATUAL ==");
        System.out.println(fila.peek());

        System.out.println("\n== TAREFAS PENDENTES ==");
        System.out.println(fila);

    }

}
