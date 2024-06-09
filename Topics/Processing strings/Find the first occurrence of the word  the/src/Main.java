import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String sentenceLower = sentence.toLowerCase();
        String[] arraySentence = sentence.split(" ");
        String[] arraySentenceLower = sentenceLower.split(" ");
        boolean encontrada = false;

        if (sentence.indexOf("The") != -1){
            System.out.println("0");
        } else if (sentenceLower.indexOf("the") != -1) {
            System.out.println(sentenceLower.indexOf("the"));
        } else if (sentenceLower.indexOf("the") == -1){
            System.out.println("-1");
        }


    }
}