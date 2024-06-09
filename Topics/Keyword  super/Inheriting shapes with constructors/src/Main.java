import java.util.Scanner;

// Define the base class Shape
class Shape {
    protected String shapeName;
    // TODO: Add a constructor that takes the shape's name as a parameter
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    // TODO: Add a getter method to retrieve the shape's name

}

// Define the derived class Rectangle
class Rectangle extends Shape {
    protected String name;
    protected int width;
    protected int height;
    // TODO: Add a constructor that takes the shape's name, width, and height as parameters
    public Rectangle(String name, int width,int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    // TODO: Call the base class constructor using the super keyword

    // TODO: Add getter methods to retrieve the rectangle's width and height

    public String getName() {
        return super.shapeName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read the shape's name, width, and height from the user input
        String name = scanner.nextLine();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        // TODO: Create a Rectangle object using the user input

        Rectangle rectangulo = new Rectangle(name,width,height);

        // TODO: Print out the rectangle's name, width, and height
        System.out.println("Name: " + rectangulo.getName());
        System.out.println("Width: " + rectangulo.getWidth());
        System.out.println("Height: " + rectangulo.getHeight());

    }
}