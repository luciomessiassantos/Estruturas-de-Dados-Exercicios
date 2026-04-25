package q02;

import classes.Mapa;

public class Main {

    public static void main(String[] args) {
        System.out.println(contadorPalavras("java java mapa lista mapa mapa"));
    }

    public static Mapa<String, Integer> contadorPalavras(String frase) {
        String[] palavras = frase.split(" ");

        Mapa<String, Integer> mapa = new Mapa<>();
        int counter = 0;

        for (String p : palavras) {
            for (String s : palavras) {
                if (p.equals(s)) {
                    counter++;
                }
            }
            mapa.inserir(p, counter);
            counter = 0;

        }

        return mapa;

    }

}
