package q04;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 9, 15, 7, 11, 4, 2, 67, 6, 12, 17};

        System.out.println(maiorElemento(arr));
    }

    static int maiorElemento(int[] arr) {

        // remove elemento
        int maior = arr[0];

        if (arr.length == 1) {
            return maior;
        }

        int[] nArr = Arrays.stream(arr).skip(1).toArray();
        var chamada = maiorElemento(nArr);

        // condição base


        if (maior > chamada) {
            return maior;
        }

        return chamada;
    }

}
