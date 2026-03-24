package Exercises.SenhasPrioridade;

public class Senha {

    private String nome;
    private TipoSenha tipoSenha;


    public Senha(String nome, TipoSenha tipoSenha) {
        this.nome = nome;
        this.tipoSenha = tipoSenha;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoSenha getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(TipoSenha tipoSenha) {
        this.tipoSenha = tipoSenha;
    }

    @Override
    public String toString() {
        return "Senha{" +
                "nome='" + nome + '\'' +
                ", tipoSenha=" + tipoSenha +
                '}';
    }
}
