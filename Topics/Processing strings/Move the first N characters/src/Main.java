import java.util.Scanner;
//Use "scanner.next();" instead of "scanner.nextLine();" to read input string

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String[] sArray = s.split("");
        int n = Integer.parseInt(scanner.next());

        String[] temp1 = new String[s.length()];
        int index = s.length();

        if (s.length() > n) {
            for (int i = 0; i < n; i++) {
                temp1[index - n +i] = sArray[i];
            }

            for (int i = 0; i < index - n; i++) {
                temp1[i] = sArray[n + i];
            }

            for(String letra : temp1) {
                System.out.print(letra);
            }
        } else {
            System.out.println(s);
        }



        /*String[] result = new String[s.length()];
        for (int i = s.length() - 1; i > n; i--) {
            for (int j = 0; j < n; j++) {
                result[i] = temp1[j];
            }
        }*/



    }
}