package classes;

import utils.ListaEncadeada;


public class Mapa<K, V> {
    private ListaEncadeada<Associacao<K, V>> lista;

    public Mapa() {
        this.lista = new ListaEncadeada<>();
    }

    public V inserir(K chave, V valor) {
        for (int i = 0; i < lista.getTamanho(); i++) {
            Associacao<K, V> assoc = lista.buscaPorPosicao(i);

            if (assoc.getKey().equals(chave)) {
                V antigo = assoc.getValue();
                assoc.setValue(valor);
                return antigo;
            }

        }
        lista.adiciona(new Associacao<>(chave, valor));
        return null;
    }

    public V inserir(Associacao<K, V> el) {
        for (int i = 0; i < lista.getTamanho(); i++) {
            Associacao<K, V> assoc = lista.buscaPorPosicao(i);

            if (assoc.getKey().equals(el.getKey())) {
                V antigo = assoc.getValue();
                assoc.setValue(el.getValue());
                return antigo;
            }

        }
        lista.adiciona(el);
        return null;
    }

    public boolean estaVazio() {
        return lista.getTamanho() == 0;
    }

    public V buscaValorPorChave(K chave) {

        for (int i = 0; i < this.lista.getTamanho(); i++) {
            Associacao<K, V> assoc = lista.buscaPorPosicao(i);

            if (assoc.getKey().equals(chave)) return assoc.getValue();
        }

        return null;
    }

    public V removePorChave(K chave) {

        for (int i = 0; i < this.lista.getTamanho(); i++) {
            Associacao<K, V> assoc = lista.buscaPorPosicao(i);

            if (assoc.getKey().equals(chave)) return lista.removePorPosicao(i).getValue();
        }

        return null;
    }

    public K[] listarChaves() {
        K[] chaves = (K[]) new Object[this.lista.getTamanho()];

        for (int i = 0; i < this.lista.getTamanho(); i++) {
            chaves[i] = this.lista.buscaPorPosicao(i).getKey();
        }

        return chaves;
    }

    public V[] listarValores() {
        V[] valores = (V[]) new Object[this.lista.getTamanho()];

        for (int i = 0; i < this.lista.getTamanho(); i++) {
            valores[i] = this.lista.buscaPorPosicao(i).getValue();
        }

        return valores;

    }

    public int tamanho() {
        return lista.getTamanho();
    }

    public Associacao<K, V> buscaPorIndice(int i) {
        return lista.buscaPorPosicao(i);
    }

    @Override
    public String toString() {
        return "classes.Mapa{" + "lista=" + lista +
                '}';

    }
}
