import java.util.Scanner;

public class vector_and_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int vector[] = new int[5];
        int i;

        System.out.print("Filing the vector...");
        for (i = 0; i < 5; i++) {
            System.out.print("Position [" + i + "] = ");
            vector[i] = input.nextInt();
        }

        System.out.println("Displaying the vector...");
        for (i = 0; i < 5; i++) {
            System.out.println("Vector [" + i + "] = " + vector[i]);
        }

        int sum = 0;
        for (i = 0; i < 5; i++) {
            sum = sum + vector[i];
        }
        System.out.println("Elements sum = " + sum);

        int matrix[][] = new int[4][2];
        int l, c;

        System.out.println("Filing the matrix [4][2]");
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 2; c++) {
                System.out.print("Position [" + l + "][" + c + "] = ");
                matrix[l][c] = input.nextInt();
            }
        }

        System.out.println("\nDisplaying the matrix [4][2]");
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 2; c++) {
                System.out.print(matrix[l][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nAdding the elements of the matrix [4][2]");
        sum = 0;
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 2; c++) {
                sum = sum + matrix[l][c];
            }
        }
        System.out.println("Sum = " + sum);

        input.close();
    }
}