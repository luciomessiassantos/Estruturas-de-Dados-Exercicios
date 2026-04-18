package q02;

public class Main {

    public static void main(String[] args) {
        System.out.println(validaPalindromo("arara"));
        System.out.println(validaPalindromo("sopa"));
    }

    static boolean validaPalindromo(String str) {

        // caso todas as extremidades sejam validadas, e sobra uma string de um caractere ou zero, retorna true,
        // é palíndromo
        if (str.length() <= 1) {
            return true;
        }
        // caso duas extremidades sejam diferentes, retorna false, não é palíndromo
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // diminuo a string em suas duas extremidades
        return validaPalindromo(str.substring(1, str.length() - 1));
    }


}
