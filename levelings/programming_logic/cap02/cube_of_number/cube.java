import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, cube;

        // - Read the number
        System.out.print("Enter a number: ");
        num = input.nextInt();

        // - Calculate the cube
        cube = num * num * num;

        // - Display cube value
        System.out.print("Result: " + cube);

        input.close();
    }
}
