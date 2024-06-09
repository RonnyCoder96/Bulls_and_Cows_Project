import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] text = input.split(" ");
        String biggerWord = "";

        for(String palabra : text) {
            if (palabra.length() > biggerWord.length()) {biggerWord = palabra;}
        }

        System.out.println(biggerWord);

    }
}