import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the first grade: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = scanner.nextDouble();

        double average = (grade1 + grade2) / 2;

        System.out.println("Student " + name + "has an average of: " + average);

        scanner.close();
    }
}
