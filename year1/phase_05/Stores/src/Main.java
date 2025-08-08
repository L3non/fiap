import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        int op;

        do {
            System.out.println("Choose a option:\n 1-Register Product\n 2-Display Product\n 3-Buy\n 4-Add Stock\n 5-Apply Discount\n 0-Exit");
                    op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter product name:");
                    String name = sc.next() + sc.nextLine();
                    System.out.println("Enter product price:");
                    double price = sc.nextDouble();
                    System.out.println("Enter the stock quantity:");
                    int stock = sc.nextInt();
                    product = new Product(name, price, stock);
                    break;
                case 2:
                    product.displayInformation();
                    break;
                case 3:
                    System.out.println("Enter the quantity to purchase:");
                    int amt = sc.nextInt();
                    product.buy(amt);
                    break;
                case 4:
                    System.out.println("Enter the quantity to add to stock:");
                    amt = sc.nextInt();
                    product.addStock(amt);
                    break;
                case 5:
                    System.out.println("Enter the discount percentage:");
                    double discount = sc.nextDouble();
                    product.applyDiscount(discount);
                    break;
                case 0:
                    System.out.println("Finishing program");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (op != 0);

        sc.close();

    }
}