import java.util.*;

public class Main {
    public static char temp = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upper = scanner.nextInt();
        int lower = scanner.nextInt();
        int digits = scanner.nextInt();
        int len = scanner.nextInt() - upper - lower - digits;
        findSymbol(upper, 26, 65);
        findSymbol(lower, 26, 97);
        findSymbol(digits, 10, 48);

        findSymbol(len, 26, 97);
    }

    public static void findSymbol(int count, int dif, int min) {

        for (int i = 0; i < count; i++) {
            char r = (char) (Math.random() * dif + min);
            while (temp == r) {
                r = (char) (Math.random() * dif + min);
            }
            temp = r;
            System.out.print(r);
        }


    }

}

