import java.util.Scanner;

public class chained_diversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sal, ir, net_sal;

        System.out.print("Enter your salary: ");
        sal = input.nextDouble();

        if (sal <= 1900) {
            ir = 0;

        } else if (sal <= 2800) {
            ir = sal * 0.15;

        } else {
            ir = sal * 0.275;
            
        }
        net_sal = sal - ir;
        System.out.println("IR: " + ir);
        System.out.println("Net Salary: " + net_sal);

        input.close();
    }
}