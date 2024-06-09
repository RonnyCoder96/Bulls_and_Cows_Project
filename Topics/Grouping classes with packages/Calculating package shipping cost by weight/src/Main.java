import java.util.Scanner;

// TODO: Implement the 'getShippingCost' method to calculate the shipping cost based on the package weight
class Package {
    private double weight;

    public Package(double weight) {
        this.weight = weight;
    }

    public double getShippingCost() {
        if (weight <= 5) {
            return 5;
        } else {
            return 5 + (weight - 5);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // TODO: Read the package weight from the user
        double packageWeight = scanner.nextDouble();
        packageWeight = Math.ceil(packageWeight);

        // TODO: Create an instance of the Package class with the entered weight
        Package paquete = new Package(packageWeight);


        // TODO: Print the shipping cost
        System.out.println(paquete.getShippingCost());
    }
}