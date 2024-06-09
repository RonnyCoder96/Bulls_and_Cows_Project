import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] sentenceArray = sentence.split(" ");
        String count = "";
        for (String i : sentenceArray) {
            if (i.length() > count.length()) {count = i;}
        }
        System.out.println(count);

    }
}