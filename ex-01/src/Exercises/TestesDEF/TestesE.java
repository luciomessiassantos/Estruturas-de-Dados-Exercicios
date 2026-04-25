package Exercises.TestesDEF;


import Exercises.Vetor;

public class TestesE {

    public void testeVetor8() {
        var vetor = new Vetor(7);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("B");
        vetor.adicionar("D");

        vetor.imprimeUmPorLinha();

        System.out.println();

        System.out.println(vetor.remove("B"));
        System.out.println();
        vetor.imprimeUmPorLinha();

        System.out.println(vetor.remove("X"));
        System.out.println();
        vetor.imprimeUmPorLinha();


    }

}
