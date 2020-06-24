import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        System.out.println("Welcome to our application that calculates areas of four different shapes!");
        System.out.println("What type of shape do you want to find area of?");
        System.out.println("\tEnter \"c\" or \"circle\" for circle");
        System.out.println("\tEnter \"t\" or \"triangle\" for triangle");
        System.out.println("\tEnter \"r\" or \"rectangle\" for rectangle");
        System.out.println("\tEnter \"s\" or \"square\" for square");

        String typeOfShape = scanner.next();
        typeOfShape.toLowerCase();

        switch (typeOfShape.charAt(0)) {
            case 'c':
                circle(scanner, decimalFormat);
                break;
            case 't':
                triangle(scanner, decimalFormat);
                break;
            case 'r':
                rectangle(scanner, decimalFormat);
                break;
            case 's':
               square(scanner, decimalFormat);
                break;
            default:
                scanner.close();
        }
    }

            /* Helper Methods*/
    // For Circle
    public static void circle(Scanner scanner, DecimalFormat decimalFormat){
        System.out.println("In order to find the area of a circle");
        System.out.println("\tEnter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = areaOfCircle(radius);
        System.out.printf("The area of a circle with radius of (%s) is: " +
                decimalFormat.format(area), decimalFormat.format(radius));
    }

    // For Triangle
    public static void triangle(Scanner scanner, DecimalFormat decimalFormat){
        System.out.println("In order to find the area of a triangle");
        System.out.println("\tEnter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("\tEnter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = areaOfTriangle(base, height);

        System.out.printf("The area of a triangle with base of (%s) and height of (%s) is: " +
                            decimalFormat.format(area), decimalFormat.format(base),
                            decimalFormat.format(height));
    }

    // Fpr Rectangle
    public static void rectangle(Scanner scanner, DecimalFormat decimalFormat){
        System.out.println("In order to find the area of a rectangle");
        System.out.println("\tEnter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("\tEnter the length of the rectangle: ");
        double length = scanner.nextDouble();

        double area = areaOfRectangle(width, length);
        System.out.printf("The area of a rectangle with width of (%s) and height of (%s) is: " +
                            decimalFormat.format(area), decimalFormat.format(width),
                            decimalFormat.format(length));
    }

    // For Square
    public static void square(Scanner scanner, DecimalFormat decimalFormat){
        System.out.println("In order to find the area of a square");
        System.out.println("\tEnter the side size of the square: ");
        double sideLength = scanner.nextDouble();
        double area = areaOfSquare(sideLength);
        System.out.printf("The area of a square with side of (%s) is: " +
                decimalFormat.format(area), decimalFormat.format(sideLength));
    }

            /* Calculation methods */

    // Area of a circle = π * r^2
    public static double areaOfCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    // Area of a triangle = (b * h)/2 (base x height)/2
    public static double areaOfTriangle(double base, double height){
        return (base * height) / 2;
    }

    // Area of a rectangle = l * w (length x width)
    public static double areaOfRectangle(double width, double length){
        return width * length;
    }

    // Area of a square = a^2 (a is the length of one side of a square)
    public static double areaOfSquare(double side){
        return areaOfRectangle(side, side);
    }

}
