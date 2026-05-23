import java.util.Scanner;

public class CircleOperations {
    static double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }

    static double calculateArea(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.println("Circumference: " + calculateCircumference(radius));
        
        System.out.println("Area: " + calculateArea(radius));

        sc.close();
    }
}
