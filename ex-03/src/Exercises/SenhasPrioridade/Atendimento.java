package Exercises.SenhasPrioridade;

import Exercises.Fila;

public class Atendimento {
    private Fila<Senha> filaNormal;
    private Fila<Senha> filaPrioritaria;

    private int totalFila;
    private int nAtendimentos = 0;

    public Atendimento(Fila<Senha> filaPrioritaria, Fila<Senha> filaNormal) {
        this.filaPrioritaria = filaPrioritaria;
        this.filaNormal = filaNormal;
    }

    public void enfileirar(Senha senha) {
        if (senha.getTipoSenha() == TipoSenha.NORMAL) {
            this.filaNormal.enqueue(senha);
            this.totalFila++;
            return;
        }

        this.filaPrioritaria.enqueue(senha);
        this.totalFila++;
    }

    public Senha atender() {
        if (this.filaPrioritaria.isEmpty()) {
            return this.filaNormal.dequeue();
        }

        if (this.filaNormal.isEmpty()) {
            return this.filaNormal.dequeue();
        }

        if (this.nAtendimentos == 3) {
            this.nAtendimentos = 0;
            return this.filaNormal.dequeue();
        }
        this.nAtendimentos++;
        return this.filaPrioritaria.dequeue();
    }


    public int getTotalFila() {
        return this.totalFila;
    }
}
