package q06;

import classes.Mapa;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Mapa<Integer, String> mapaNovo = new Mapa<>();

        mapaNovo.inserir(1, "A");
        mapaNovo.inserir(2, "B");
        mapaNovo.inserir(3, "C");
        mapaNovo.inserir(4, "D");

        System.out.println("Normal: " + mapaNovo);

        System.out.println();

        System.out.println("Invertido: " + inverteMapa(mapaNovo));
    }

    static Mapa<String, Integer> inverteMapa(Mapa<Integer, String> mapa) {

        // transformar em Objects genéricos para evitar error de casting
        Object[] chaves = mapa.listarChaves();
        Object[] valores = mapa.listarValores();

        Mapa<String, Integer> invertido = new Mapa<>();

        for (int i = 0; i < chaves.length; i++) {
            // casting manual de cada valor
            Integer value = (Integer) chaves[i];
            String key = (String) valores[i];
            invertido.inserir(key, value);
        }

        return invertido;
    }

}
