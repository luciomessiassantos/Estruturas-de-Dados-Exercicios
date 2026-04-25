package q01;

import classes.Associacao;
import classes.Mapa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var alunos = new Mapa<Integer, String>();

        inserirAlunos(alunos);

        testaBuscaAlunoPorMatricula(alunos);
        System.out.println();
        System.out.println("Testa remoção");
        testaRemoveAluno(alunos);

        System.out.println("\n");
        System.out.println("Listar chaves: ");
        System.out.println(Arrays.toString(alunos.listarChaves()));

        System.out.println("\n");
        System.out.println("Listar valores: ");
        System.out.println(Arrays.toString(alunos.listarValores()));


    }


    static void inserirAlunos(Mapa<Integer, String> mapaAlunos) {
        var asco1 = new Associacao<Integer, String>(17899, "Roiter");
        var asco2 = new Associacao<Integer, String>(28893, "Calleb");
        var asco3 = new Associacao<Integer, String>(90188, "Nolan");
        var asco4 = new Associacao<Integer, String>(117652, "Maike");
        var asco5 = new Associacao<Integer, String>(77355, "Goltk");

        mapaAlunos.inserir(asco1);
        mapaAlunos.inserir(asco2);
        mapaAlunos.inserir(asco3);
        mapaAlunos.inserir(asco4);
        mapaAlunos.inserir(asco5);

        System.out.println(mapaAlunos);
    }

    static void testaBuscaAlunoPorMatricula(Mapa<Integer, String> mapaAlunos) {
        // encontra aluno
        System.out.println(mapaAlunos.buscaValorPorChave(17899));

        // retorna null
        System.out.println(mapaAlunos.buscaValorPorChave(10000));

    }

    static void testaRemoveAluno(Mapa<Integer, String> mapaAlunos) {
        System.out.println(mapaAlunos);

        // remove aluno existente
        System.out.println("Removido: " + mapaAlunos.removePorChave(17899));

        System.out.println(mapaAlunos);

        // tenta remover inexistente
        System.out.println("Removido?: " + mapaAlunos.removePorChave(99999));

        System.out.println(mapaAlunos);
    }




}
