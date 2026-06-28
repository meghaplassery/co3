import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter first number (A): ");
        int A = sc.nextInt();

        System.out.print("Enter second number (B): ");
        int B = sc.nextInt();

        // Operations
        int addition = A + B;
        int subtraction = A - B;
        int multiplication = A * B;

        // Handle division safely
        int division = 0;
        int modulus = 0;

        if (B != 0) {
            division = A / B;
            modulus = A % B;
        } else {
            System.out.println("Division and Modulus not possible (B = 0)");
        }

        // Output
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);

        if (B != 0) {
            System.out.println("Division = " + division);
            System.out.println("Modulus = " + modulus);
        }

        sc.close();
    }
}