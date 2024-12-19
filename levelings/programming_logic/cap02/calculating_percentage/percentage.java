import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value, p, perc, addi, disc;

        // - Read the value
        System.out.print("Enter the value: ");
        value = input.nextDouble();

        // - Read the percentage
        System.out.print("Enter the percentage: ");
        p = input.nextDouble();

        // - Calculate the percentage
        perc = value * p / 100;

        // - Calculate the addition
        addi = value + perc;

        // - Calculate the discount
        disc = value - perc;

        // - Display the percentage
        System.out.println("Percentage: " + perc);

        // - Display the addition
        System.out.println("Addition: " + addi);

        // - Display the discount
        System.out.println("Discount: " + disc);

        input.close();
    }
}
