package Exercises.AgendamentoDeTarefas;

public class Tarefa {

    protected String nome;
    protected int prioridade;

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return nome;
    }
}
