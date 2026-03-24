package Exercises.FilaDeImpressao;

public class Documento {

    protected String nome;
    protected int paginas;

    public Documento(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return nome;
    }
}
