import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double n2 = scanner.nextDouble();

        double sum = n1 + n2;
        double subtraction = n1 - n2;
        double multiplication = n1 * n2;
        double division = n1 / n2;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        scanner.close();
    }
}
