import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra = scanner.nextLine();
        char[] palabras = palabra.toCharArray();
        int consonantes = 0;
        int vocales = 0;
        int result = 0;

        for (char letra : palabras) {
            if ("aeiouy".contains(String.valueOf(letra))) {
                vocales += 1;
                consonantes = 0;
            } else {
                consonantes += 1;
                vocales = 0;
            }

            if ((vocales > 2 || consonantes > 2) && (vocales % 2 == 1 || consonantes % 2 == 1) ) {
                result += 1;
            }

        }

        System.out.println(result);

    }

}