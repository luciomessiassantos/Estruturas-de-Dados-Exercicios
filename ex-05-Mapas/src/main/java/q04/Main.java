package q04;

import classes.Associacao;
import classes.Mapa;

public class Main {

    public static void main(String[] args) {
        Mapa<String, Integer> estoque = new Mapa<>();

        inserirProdutosTeste(estoque);

        System.out.println(estoque);
        System.out.println();
        System.out.println("Venda 1: Monitor 21' 140hz");
        vendaProduto(estoque, "Monitor 21' 140hz", 2);
        System.out.println();
        System.out.println(estoque);


        System.out.println("Venda 2: Gabinete gamer com ventoinhas led");
        vendaProduto(estoque, "Gabinete gamer com ventoinhas led", 4);
        System.out.println();
        System.out.println(estoque);

    }

    static void inserirProdutosTeste(Mapa<String, Integer> estoque) {
        Associacao<String, Integer> produto = new Associacao<>("Monitor 21' 140hz", 120);
        Associacao<String, Integer> produto1 = new Associacao<>("Teclado Mecânico Switch Marrom Redragon", 84);
        Associacao<String, Integer> produto2 = new Associacao<>("Mouse sem fio, 3200cps 0.2 kg", 232);
        Associacao<String, Integer> produto3 = new Associacao<>("Gabinete gamer com ventoinhas led", 338);

        estoque.inserir(produto);
        estoque.inserir(produto1);
        estoque.inserir(produto2);
        estoque.inserir(produto3);

    }

    static void vendaProduto(Mapa<String, Integer> estoque, String produto, int quantidade) {
        Associacao<String, Integer> produtoAtualizado = new Associacao<>(produto, estoque.buscaValorPorChave(produto) - quantidade);
        estoque.inserir(produtoAtualizado);

    }


}
