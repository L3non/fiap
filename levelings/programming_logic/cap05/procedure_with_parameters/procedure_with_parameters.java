import java.util.Scanner;

public class procedure_with_parameters {
    public static void greetings(int time) {
        String msg;

        if (time < 12)
            msg = "Good morning";
        else if (time < 18)
            msg = "Good afternoon";
        else 
            msg = "Good evening";

        System.out.print(msg + ", Welcome to FIAP!");
    }

    public static void main(String[] args) {
        greetings(12);
    }
}
