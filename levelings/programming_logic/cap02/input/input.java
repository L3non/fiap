import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, dou;
        
        System.out.print("Enter a number: ");
        num = input.nextInt();
        dou = num + num;
        System.out.print("Double = " + dou);

        input.close();
    }
}