import java.util.Scanner;

public class functions_without_parameters {
    public static double pi() {
        return (3.14159);
    }

    public static void main(String[] args) {
        double a, r = 5;
        a = pi() * (r * r);
        System.out.print("The area of ​​the circle with radius " + r + " is" + a);
    }
}
