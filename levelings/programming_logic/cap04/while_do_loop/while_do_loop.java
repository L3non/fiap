import java.util.Scanner;

public class while_do_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String option;

        System.out.print("Enter [Y]es or [N]o: ");
        option = input.next();

        while (!(option.equals("y") || option.equals("Y") || option.equals("n") || option.equals("N"))) {
            System.out.println("You typed: " + option + "Enter Y or N!");
            System.out.print("Enter [Y]es or [N]o: ");
            option = input.next();
        }
        System.out.println("You typed: " + option);

        input.close();
    }
}
