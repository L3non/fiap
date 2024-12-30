import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, sum = 0;

        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num > 0) {
                sum = sum + num;
            }
        } while (num >= 0);

        System.out.print("Sum = " + sum);

        input.close();
    }
}