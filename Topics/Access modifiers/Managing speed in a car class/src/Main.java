import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car carro = new Car();
        carro.drive(scanner.nextInt());
        carro.displaySpeed();
        // Instantiate a Car object here and use the drive method
        // Use displaySpeed to print the current speed
    }
}

class Car {
    private int speed;

    public Car() {
        // Initialize the speed field here
    }

    public void drive(int increase) {
        // Write a method that takes an integer as argument 
        // and adds it to the 'speed'.
        // Use a condition to check if the speed becomes greater than 200
        // if so, cap the speed at 200
        if (increase > 200) {
            this.speed = 200;
        } else {
            this.speed += increase;
        }
    }

    public void displaySpeed() {
        // Write a method that prints the current speed
        System.out.println(speed);
    }
}