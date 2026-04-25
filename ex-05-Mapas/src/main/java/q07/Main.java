package q07;

import classes.Associacao;
import classes.Mapa;

public class Main {

    public static void main(String[] args) {
        Mapa<String, Integer> ranking = new Mapa<>();

        inserirJogadores(ranking);
        System.out.println(ranking);
        System.out.println();

        exibeMaiorPontuacao(ranking);

    }

    static void inserirJogadores(Mapa<String, Integer> ranking) {
        ranking.inserir("Jogador2", 20);
        ranking.inserir("joador01", 12);
        ranking.inserir("jogador90", 100);
        ranking.inserir("jogador1", 91);
    }

    static void exibeMaiorPontuacao(Mapa<String, Integer> ranking) {

        Object[] chaves = ranking.listarChaves();

        // casting manual
        var maior = (String) chaves[0];

        for (int i = 0; i < ranking.tamanho(); i++) {
            String chave = (String) chaves[i];
            // valida atraves da busca por valores
            if (ranking.buscaValorPorChave(maior) < ranking.buscaValorPorChave(chave)) {
                maior = chave;
            }
        }

        System.out.println(maior);
    }
}
