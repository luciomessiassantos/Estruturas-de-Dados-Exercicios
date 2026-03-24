package Exercises.ImpressaoUrgencia;

public class DocumentoPrioridade implements Comparable<DocumentoPrioridade> {

    private String nome;
    private int paginas;
    private int prioridade;


    public DocumentoPrioridade(String nome, int paginas, int prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(DocumentoPrioridade o) {
        if (o.prioridade < this.prioridade) {
            return 1;
        } else if (o.prioridade == this.prioridade) {
            return 0;
        }
        return -1;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }


    @Override
    public String toString() {
        return "DocumentoPrioridade{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                ", prioridade=" + prioridade +
                '}';
    }
}
