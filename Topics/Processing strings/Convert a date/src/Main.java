import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldDate = scanner.nextLine();
        String[] oldDateArray = oldDate.split("-");

        System.out.println(oldDateArray[1] + "/" + oldDateArray[2] + "/" + oldDateArray[0] );
    }
}