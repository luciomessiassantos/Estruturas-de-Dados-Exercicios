package q05;

public class Main {

    public static void main(String[] args) {
        System.out.println("Contagem: " + contarDigitos(3459838283718774918L));
    }

    static int contarDigitos(long valor) {

        var str = String.valueOf(valor);
        StringBuilder valorStr = new StringBuilder(str);

        int sum = 1;
        if (valorStr.length() <= 1) {
            return 1;
        }

        valorStr.deleteCharAt(0);

        sum = contarDigitos(Long.parseLong(valorStr.toString()));

        return sum + 1;
    }
}
