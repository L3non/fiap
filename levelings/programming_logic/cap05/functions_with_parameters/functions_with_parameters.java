import java.util.Scanner;

public class functions_with_parameters {
    public static boolean valid_grade(double grade) {
        if (grade >= 0 && grade <= 10) {
            return (true);
        } else {
            return (false);
        }
    }

    public static void main(Srting[] args) {
        Scanner input = new Scanner(System.in);

        double grade1, grade2, average;

        System.out.print("Enter the first grade: ");
        grade1 = input.nextDouble();

        if (valid_grade(grade1)) {
            System.out.print("Enter the second grade: ");
            grade2 = input.nextDouble();

            if (valid_grade(grade2)) {
                average = (grade1 + grade2) / 2;
                System.out.print("The average between " + grade1 + " and " + grade2 + " is " + average);
            } else {
                System.out.print("The second grade => '" + grade2 + "' is not valid");
            }
        } else {
            System.out.print("The first grade => '" + grade1 + "' is not valid");
        }

        input.close();
    }
}