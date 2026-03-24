package Exercises;

public class Teste {

    public void TesteVetor1() {
        var vetor = new Vetor(3);
        vetor.adicionar("Linha de cerol");
        vetor.adicionar("Argamassa");
        vetor.adicionar("Fixador");

        System.out.println(vetor.getTamanho());
        vetor.imprimeUmPorLinha();

    }

    public void TesteVetor2() {
        var vetor = new Vetor(10);
        vetor.adicionar("Linha de cerol");
        vetor.adicionar("Argamassa");
        vetor.adicionar("Fixador");
        vetor.adicionar("Tinta");

        // busca com sucesso
        int find = vetor.busca("Fixador");

        // busca mal sucedida
        int notFind = vetor.busca("Cimento");

        System.out.println(find);
        System.out.println(notFind);

        // contem bem sucedido
        boolean contem = vetor.contem("Argamassa");

        // não contem
        boolean naoContem = vetor.contem("Corda");

        System.out.println(contem);
        System.out.println(naoContem);

    }

    public void TesteVetor3() throws Exception{

        var vetor = new Vetor(6);

        try {
            String valorInvalido = vetor.ultimo();
            System.out.println(valorInvalido);
        } catch (Exception e) {
            System.out.println("Não há elementos, o vetor está vazio...");
        }

        vetor.adicionar("Linha de cerol");
        vetor.adicionar("Argamassa");
        vetor.adicionar("Fixador");
        vetor.adicionar("Tinta");

        String valorValido = vetor.ultimo();

        System.out.println("Valor válido: ");
        System.out.println(valorValido);

    }

    public void TesteVetor4() {
        var vetor = new Vetor(4);
        vetor.adicionar("Makita");
        vetor.adicionar("Telha brasilite");
        vetor.adicionar("Joelho de 12");
        vetor.adicionar("Torneira");

        // impressão inicial, antes da limpeza
        vetor.imprimeUmPorLinha();

        vetor.limpar();

        // impressão após a limpeza
        vetor.imprimeUmPorLinha();

    }

    public void TesteVetor5() {
        var vetor = new Vetor(10);
        vetor.adicionar("Makita");
        vetor.adicionar("Telha brasilite");
        vetor.adicionar("Joelho de 12");
        vetor.adicionar("Torneira");
        vetor.adicionar("Torneira");
        vetor.adicionar("Torneira");
        vetor.adicionar("Torneira");
        vetor.adicionar("Torneira");
        vetor.adicionar("Makita");
        vetor.adicionar("Makita");

        int ocorrencia1 = vetor.contarOcorrencias("Torneira");
        int ocorrencia2 = vetor.contarOcorrencias("Makita");
        System.out.println(ocorrencia1);
        System.out.println(ocorrencia2);
    }


    public void testeVetor6() {
        var vetor = new Vetor(7);
        vetor.adicionar("Makita");
        vetor.adicionar("Telha brasilite");
        vetor.adicionar("Joelho de 12");
        vetor.adicionar("Torneira");
        vetor.adicionar("Alvenaria");
        vetor.adicionar("Arame");

        // substituir por um elemento existente

        vetor.imprimeUmPorLinha();
        System.out.println();
        vetor.substituir("Makita", "Cerrote");
        System.out.println();
        vetor.imprimeUmPorLinha();


    }




}
