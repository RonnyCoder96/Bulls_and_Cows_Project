import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] wordChar = word.toCharArray();
        String reverseWord = "";

        for (int i = word.length() -1; i >= 0 ; i--) {
            reverseWord += wordChar[i];
        }

        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}