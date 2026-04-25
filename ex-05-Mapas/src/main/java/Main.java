import classes.Associacao;
import classes.Mapa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var asco1  = new Associacao<Integer, String>(2, "Educação");
        var asco2  = new Associacao<Integer, String>(12, "Futuro");
        var asco3  = new Associacao<Integer, String>(872, "Olimpiadas");

        var asco4  = new Associacao<Integer, String>(12098, "Ateu");


        var mapa = new Mapa<Integer, String>();
        mapa.inserir(asco1);
        mapa.inserir(asco2);
        mapa.inserir(asco3);
        mapa.inserir(asco4);

        System.out.println(mapa);

        Object[] chaves = mapa.listarChaves();

        System.out.println(Arrays.toString(chaves));

    }
}
