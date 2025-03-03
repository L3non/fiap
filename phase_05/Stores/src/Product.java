public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(){}
    public void displayInformation() {
        System.out.println("Product name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + quantity);
    }

    public void buy(int amountPurchased) {
        if (amountPurchased <= quantity) {
            quantity -= amountPurchased;
            System.out.println("Purchase successful! Quantity remaining: " + quantity);
        } else {
            System.out.println("Insufficient quantity in stock!");
        }
    }

    public void addStock(int quantityAdditional) {
        quantity += quantityAdditional;
        System.out.println("Quantity added to inventory. New total: " + quantity);
    }

    public void applyDiscount(double percentageDiscount) {
        double discount = price * (percentageDiscount / 100);
        price -= discount;
        System.out.println("Discount applied! New price: $" + price);
    }
}