import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        char[] raw = texto.toCharArray();
        int count = 1;

        for (int i = 0; i < texto.length(); i++) {
            if ((i < raw.length -1) && (raw[i] == raw[i + 1])) {
                count ++;
            } else {
                System.out.print(raw[i]);
                System.out.print(count);
                count = 1;
            }
        }
    }
}