import java.util.Scanner;

public class Main {

    // Create a method named 'process' to handle integers
    public static int process(int number) {
        return number * number; // Return the square of the number
    }

    // Create a method named 'process' to handle floats
    public static int process(float number) {
        return Math.round(number); // Return the number rounded to the nearest whole number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line of input from the console
        String input = scanner.nextLine();

        try {
            int integerInput = Integer.parseInt(input);
            // Call the 'process' method with the integer input and print the result
            System.out.println(process(integerInput));
        } catch (NumberFormatException e) {
            float floatInput = Float.parseFloat(input);
            // Call the 'process' method with the float input and print the result
            System.out.println(process(floatInput));
        }
    }
}
