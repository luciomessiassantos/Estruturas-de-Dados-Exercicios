package Exercises.TestesDEF;

import Exercises.Vetor;

public class TestesD {

    public void testeVetor7() {
        var vetor = new Vetor(7);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");


        vetor.imprimeUmPorLinha();

        vetor.remove(0);
        System.out.println();

        System.out.println("Após remoção do elemento:");
        System.out.println();
        vetor.imprimeUmPorLinha();
        System.out.println("Tamanho: " + vetor.getTamanho());

        vetor.remove(2);
        System.out.println();

        System.out.println("Após remoção do elemento:");
        System.out.println();
        vetor.imprimeUmPorLinha();
        System.out.println("Tamanho: " + vetor.getTamanho());

        vetor.remove(vetor.getTamanho() - 1);
        System.out.println();

        System.out.println("Após remoção do elemento:");
        System.out.println();
        vetor.imprimeUmPorLinha();
        System.out.println("Tamanho: " + vetor.getTamanho());

        vetor.remove(-10);
        System.out.println();

        System.out.println("Após remoção do elemento:");
        System.out.println();
        vetor.imprimeUmPorLinha();
        System.out.println("Tamanho: " + vetor.getTamanho());
    }

}
