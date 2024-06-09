package bullscows;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the length of the secret code:");
        int secretLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input the number of possible symbols in the code:");
        int numChar = scanner.nextInt();
        scanner.nextLine();

        while (secretLength > 36) {
            System.out.println("Error: can't generate a secret number with a length of "+secretLength+" because there aren't enough unique digits.");
            System.out.println("Please, enter the secret code's length:");
            secretLength = scanner.nextInt();
            scanner.nextLine();
        }

        char[] secret = generateSecret(secretLength,numChar);
        System.out.println(secreteMassage(secretLength,numChar));

        boolean continuar = true;
        int turn = 1;

        do {
            System.out.println("Turn " + turn + ":");
            String intputValue = scanner.nextLine();
            char[] userInput = new char[secretLength];

            for (int i = 0; i < secretLength; i++) {
                userInput[i] = intputValue.charAt(i);
            }

            int cows = 0;
            int bulls = 0;

            for (int i = 0; i < secretLength; i++) {
                if (secret[i] == userInput[i]) {
                    bulls++;} else {
                    for (int j = 0; j < secretLength; j++) {
                        if (secret[i] == userInput[j]) {cows++;}
                    }
                }

            }

            if (bulls < secretLength) {
                System.out.println("Grade: "+ bulls+" bull and "+cows+" cow");
                turn++;
            } else {
                System.out.println("Grade: "+bulls+" bulls");
                System.out.println("Congratulations! You guessed the secret code.");
                continuar = false;
            }


        } while (continuar);


    }

    public static char[] generateSecret(int length, int range) {
        Random random = new Random();

        char[] elements = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] subsegmento = Arrays.copyOfRange(elements,0,range);

        Set<Character> caracteresUnicos = new HashSet<>();

        while (caracteresUnicos.size() < length) {
            int indiceAleatorio = random.nextInt(subsegmento.length);
            caracteresUnicos.add(subsegmento[indiceAleatorio]);
        }

        char[] secret = new char[length];
        int index = 0;
        for (char i : caracteresUnicos) {
            secret[index++] = i;
        }

        return secret;

    }

    public static String secreteMassage(int length, int range) {
        String astericos = "";
        String intRange = "";
        String letterRange = "";
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < length; i++) {
            astericos +="*";
        }

        if (range <= 10) {
            intRange += "(0-"+(range-1)+")";
            return "The secret is prepared: "+astericos+" "+intRange+".";
        } else {
            intRange += "(0-9)";
            char finalletter = letters[range - 10-1];
            letterRange += "(a-"+finalletter+").";
            return "The secret is prepared: "+astericos+" "+intRange+", "+letterRange;
        }




    }


}


