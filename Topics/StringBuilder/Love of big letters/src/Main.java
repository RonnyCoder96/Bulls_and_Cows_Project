import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        StringBuilder cadena = new StringBuilder(message);
        for (int i = 0; i < cadena.length(); i++) {
            if (i == 0 || i % 2 == 0) {
                char target = cadena.charAt(i);
                cadena.setCharAt(i,Character.toUpperCase(target));
            }

        }
        return cadena.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}