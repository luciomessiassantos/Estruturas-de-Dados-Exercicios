package q03;

import classes.Associacao;
import classes.Mapa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Mapa<String, String> listaTelefonica = new Mapa<>();

        adicionaContatos(listaTelefonica);

        System.out.println();
        System.out.println("Busca contato");
        buscaContatoTeste(listaTelefonica);

        System.out.println();
        System.out.println("Remove Contato");;
        removeContatoTeste(listaTelefonica);

        System.out.println();
        System.out.println("Exibe contatos");
        exibeContatosTeste(listaTelefonica);

    }

    static void adicionaContatos(Mapa<String, String> listaTel) {
        Associacao<String, String> contato1 = new Associacao<>("Manoel", "83981027615");
        Associacao<String, String> contato2 = new Associacao<>("Kaio", "8288715534");
        Associacao<String, String> contato3 = new Associacao<>("Lacerda", "11056342511");
        Associacao<String, String> contato4 = new Associacao<>("Erick", "8498861355");

        listaTel.inserir(contato1);
        listaTel.inserir(contato2);
        listaTel.inserir(contato3);
        listaTel.inserir(contato4);
    }

    static void buscaContatoTeste(Mapa<String, String> listaTel) {
        // busca numero de contato existente
        System.out.println(listaTel.buscaValorPorChave("Lacerda"));

        // busca numero de contato inexistente
        System.out.println(listaTel.buscaValorPorChave("Ana"));
    }

    static void removeContatoTeste(Mapa<String, String> listaTel) {
        System.out.println(listaTel);
        // remove contato existente
        System.out.println("Removido: " + listaTel.removePorChave("Lacerda"));

        System.out.println();
        System.out.println(listaTel);

        // remove contato inexistente

        System.out.println();
        System.out.println("Removido: " + listaTel.buscaValorPorChave("Ana"));

    }

    static void exibeContatosTeste(Mapa<String, String> listaTel) {
        // lista contatos com números
        System.out.println(listaTel);

        System.out.println();

        // lista apenas contatos
        System.out.println("Contatos: " + Arrays.toString(listaTel.listarChaves()));
    }

}
