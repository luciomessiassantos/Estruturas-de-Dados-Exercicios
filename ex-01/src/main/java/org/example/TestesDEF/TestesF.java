package org.example.TestesDEF;

import org.example.Vetor;

public class TestesF {


    public void testeVetor9() {
        var vetor = new Vetor(12);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("B");
        vetor.adicionar("D");
        vetor.adicionar("B");
        vetor.adicionar("B");
        vetor.adicionar("A");
        vetor.adicionar("C");

        vetor.imprimeUmPorLinha();
        System.out.println();
        System.out.println("Última ocorrência do elemento B: ");
        System.out.println(vetor.indiceUltimo("B"));

    }

    public void testeVetor10() {
        var vetor = new Vetor(12);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("B");
        vetor.adicionar("D");
        vetor.adicionar("B");
        vetor.adicionar("B");
        vetor.adicionar("A");
        vetor.adicionar("C");

        vetor.imprimeUmPorLinha();
        System.out.println();

        vetor.removerTodos("B");
        System.out.println("Após a remoção das ocorrências do elemento B");
        vetor.imprimeUmPorLinha();
    }

    public void testeVetor11() {
        var vetor = new Vetor(12);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        System.out.println();
        vetor.imprimeUmPorLinha();
        System.out.println();
        System.out.println(vetor.adicionarSeNaoExiste("H"));
        System.out.println("Após a inserção do elemento H");
        vetor.imprimeUmPorLinha();

        System.out.println("Repetição de tentativas");
        System.out.println(vetor.adicionarSeNaoExiste("H"));
        System.out.println(vetor.adicionarSeNaoExiste("H"));
        System.out.println(vetor.adicionarSeNaoExiste("H"));
        System.out.println(vetor.adicionarSeNaoExiste("H"));
        System.out.println();
    }


    public void testeVetor12() {
        var vetor = new Vetor(12);
        vetor.adicionar("A");
        vetor.adicionar("D");
        vetor.adicionar("E");

        System.out.println();
        vetor.imprimeUmPorLinha();

        System.out.println();
        System.out.println(vetor.inserirDepois("A", "B"));
        System.out.println();
        vetor.imprimeUmPorLinha();
        System.out.println("Inserção do C após o B");

        System.out.println(vetor.inserirDepois("B", "C"));

        vetor.imprimeUmPorLinha();
        System.out.println();

    }
}
