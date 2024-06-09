import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int mitad = text.length() / 2;
        if (text.length() % 2 == 1) {
            for (int i = 0; i < text.length(); i++) {
                if (i != mitad) {
                    System.out.print(text.charAt(i));
                }
            }
            //System.out.println(text.charAt(mitad+1));
        } else if (text.length() % 2 == 0) {
            for (int i = 0; i < text.length(); i++) {
                if (i != mitad-1 && i != mitad) {
                    System.out.print(text.charAt(i));
                }
            }
        }
    }
}