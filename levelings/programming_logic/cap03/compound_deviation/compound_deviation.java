import java.util.Scanner;

public class compound_deviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tc;
        double sal, increment, new_sal;

        System.out.print("Enter your time at the company: ");
        tc = input.nextInt();

        System.out.print("Enter your salary: ");
        sal = input.nextDouble();

        if (tc < 3) {
            increment = sal * 0.05;
        } else {
            increment = sal * 0.1;
        }
        new_sal = sal + increment;
        System.out.print("Your salary wnt from " + sal + "to " + new_sal);


        input.close();
    }
}