package Exercises.ControleProcessos;

public class Processo {

    private String nome;
    private long tempoExecucaoSegundos;

    public Processo(String nome, long tempoExecucaoSegundos) {
        this.nome = nome;
        this.tempoExecucaoSegundos = tempoExecucaoSegundos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTempoExecucaoSegundos() {
        return tempoExecucaoSegundos;
    }

    public void setTempoExecucaoSegundos(long tempoExecucaoSegundos) {
        this.tempoExecucaoSegundos = tempoExecucaoSegundos;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "nome='" + nome + '\'' +
                ", tempoExecucaoSegundos=" + tempoExecucaoSegundos +
                '}';
    }
}
