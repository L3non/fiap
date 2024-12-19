import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, sum;

        // Read n1
        System.out.print("Enter a number: ");
        n1 = input.nextInt();

        // Read n2
        System.out.print("Enter another number: ");
        n2 = input.nextInt();

        // sum = n1 + n2
        sum = n1 + n2;

        // Write sum
        System.out.print("Sum = " + sum);

        input.close();
    }
}