import java.util.Scanner;

class Exception1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}