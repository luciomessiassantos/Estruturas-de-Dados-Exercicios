package q03;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(somaArrayInteiro(arr));
    }

    static int somaArrayInteiro(int[] arr) {

        if (arr.length <= 1) {
            return arr[0];
        }

        // remove elemento
        int primeiro = arr[0];
        int[] nArr = Arrays.stream(arr).skip(1).toArray();

        return primeiro + somaArrayInteiro(nArr);
    }
}
