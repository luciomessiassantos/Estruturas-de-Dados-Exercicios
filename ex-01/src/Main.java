import Semi.Vetor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] vetor = { 10, 4, 15, 22, 31, 42, 47, 54 };

    }

    static int buscaSequencial(int elemento, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (elemento == vetor[i]) return i;
        }

        return -1;
    }

    static int buscaSequencialVetor(Integer elemento, Vetor<Integer> vetor) {
        return vetor.busca(elemento);
    }

    static int buscaSequencialLista(Integer elemento, List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) return i;
        }

        return -1;
    }


    public static boolean buscaEmListaEncadeada(Node head, int alvo) {
        Node atual = head;

        while (atual != null) {
            if (atual.valor == alvo) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }
}
