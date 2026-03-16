package Exercises.Question01_02_03;

public class TesteToString {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(100);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");
        pilha.empilha("D");
        pilha.empilha("E");
        pilha.empilha("F");

        System.out.println(pilha);

    }

}
