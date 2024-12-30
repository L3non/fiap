import java.util.Scanner;

public class from_to {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ini, f, cont;

        System.out.println("Enter 2 numbers: ");
        ini = input.nextInt();
        f = input.nextInt();

        for (cont = ini; cont <= f; cont++) {
            System.out.print(cont + " ");
        }

        // while (ini <= f) {
        //     System.out.print(ini + " ");
        //     ini++;
        // }

        // do {
        //     System.out.print(ini + " ");
        //     ini++;
        // } while (ini <= f);

        input.close();
    }
}