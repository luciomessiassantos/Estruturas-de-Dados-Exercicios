package q05;

import classes.Mapa;

public class Main {

    public static void main(String[] args) {
        int[] nums = {7, 8, 7, 10, 8, 7};
        System.out.println(contaOcorrencia(nums));
    }

    static Mapa<Integer, Integer> contaOcorrencia(int[] numeros) {

        Mapa<Integer, Integer> ocorrencias = new Mapa<>();

        int count = 0;

        for (int n : numeros) {
            for (int n2 : numeros) {
                if (n == n2) count++;
            }
            ocorrencias.inserir(n, count);
            count = 0;
        }

        return ocorrencias;
    }
}
