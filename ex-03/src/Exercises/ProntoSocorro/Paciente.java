package Exercises.ProntoSocorro;

public class Paciente {

    protected String nome;
    protected int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String nomePrioridade() {
        return switch (this.prioridade) {
            case 1 -> "Urgente";
            case 2 -> "Média";
            case 3 -> "Baixa";
            default -> "Desconhecida";
        };
    }

    @Override
    public String toString() {
        return nome;
    }

}
