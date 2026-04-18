package q01;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tester: " + inverteStringRecursiva("Java"));
        System.out.println(inverteStringRecursiva("Cavalo"));
    }

    static String inverteStringRecursiva(String str) {

        // condicao base
        if (str.length() == 1) {
            return str;
        }

        // remove um caractere
        var stb = new StringBuilder(str);
        stb.deleteCharAt(0);

        // une o primeiro caractere da string inicial dada
        return inverteStringRecursiva(stb.toString()) + str.charAt(0);
    }

    // char[] chars = str.split()
    // strbuilder stb
    // for i = chars.length; i > 0; i-- // enquanto a string não é vazia
    //  stb.append chars[i]
}
