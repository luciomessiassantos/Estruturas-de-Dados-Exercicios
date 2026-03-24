package Exercises.ImpressaoUrgencia;

import Exercises.FilaPrioridade;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        FilaPrioridade<DocumentoPrioridade> filaPrioridade = new FilaPrioridade<>(
                Comparator.comparing(DocumentoPrioridade::getPrioridade), 9
        );

        filaPrioridade.enqueue(new DocumentoPrioridade("Relatório", 5, 6));

        filaPrioridade.enqueue(new DocumentoPrioridade("Prontuário", 1, 3));
        filaPrioridade.enqueue(new DocumentoPrioridade("Resumo_disciplina", 2, 1));

        filaPrioridade.enqueue(new DocumentoPrioridade("Currículo_Estágio", 1, 2));
        filaPrioridade.enqueue(new DocumentoPrioridade("Exercício002", 3, 5));
        filaPrioridade.enqueue(new DocumentoPrioridade("Relatório-2", 3, 5));
        filaPrioridade.enqueue(new DocumentoPrioridade("Prescrição", 1, 6));
        filaPrioridade.enqueue(new DocumentoPrioridade("Exame_médico", 2, 3));

        System.out.println(filaPrioridade);

        // impressão por prioridade
        int tamanhoInicial = filaPrioridade.getTamanho();
        for (int i = 0; i < tamanhoInicial; i++) {
            System.out.println(filaPrioridade.dequeue());
        }
    }
}
