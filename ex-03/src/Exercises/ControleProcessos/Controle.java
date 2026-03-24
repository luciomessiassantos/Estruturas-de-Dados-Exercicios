package Exercises.ControleProcessos;

import Exercises.Fila;

public class Controle {

    private Fila<Processo> filaProcessos;

    public Controle(Fila<Processo> filaProcessos) {
        this.filaProcessos = filaProcessos;
    }

    public void adicionaProcesso(Processo processo) {
        this.filaProcessos.enqueue(processo);
    }

    public Processo executaProcesso() {
        Processo executavel = this.filaProcessos.peek();
        System.out.println("Processo em execução: " + executavel);
        try {
            Thread.sleep(executavel.getTempoExecucaoSegundos()); // simular tempo de execução
        } catch (InterruptedException e) {
            System.out.println("Erro ao executar processo, tente novamente");
            return null;
        }
        return this.filaProcessos.dequeue();
    }

}
