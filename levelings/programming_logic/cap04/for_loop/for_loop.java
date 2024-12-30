import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, cont, highest;

        System.out.println("Enter 5 numbers: ");
        num = input.nextInt();
        highest = num;

        for (cont = 1; cont <= 4; cont++) {
            num = input.nextInt();

            if (num > highest) {
                highest = num;
            }
        }
        System.out.println("Highest value = " + highest);

        input.close();
    }
}