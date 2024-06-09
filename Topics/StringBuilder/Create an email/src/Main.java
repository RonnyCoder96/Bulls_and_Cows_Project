import java.util.Scanner;

class EmployeeManagement {

    public static String createEmail(String name, String surname) {
        StringBuilder identifier = new StringBuilder(name);
        identifier.append(surname);
        identifier.append("@work.net");
        return identifier.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        String completeEmail = createEmail(name, surname);

        System.out.println(completeEmail);
    }
}