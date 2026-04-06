import java.util.Scanner;

public class Calcultor {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}