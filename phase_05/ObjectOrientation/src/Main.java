import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MagicalCharacter character = new MagicalCharacter();
        int op;
        do {
            System.out.println("Choose a option: \n1-Register Character \n2-Display Character \n0-Exit");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter character name:");
                    String name = sc.next() + sc.nextLine();
                    System.out.println("Enther character power:");
                    String power =  sc.next() + sc.nextLine();
                    System.out.println("Enter energy level:");
                    int energy = sc.nextInt();
                    character.name = name;
                    character.energyLevel = energy;
                    character.magicalPower = power;
                    break;
                case 2:
                    System.out.println("Name: " + character.name + " Power: " + character.magicalPower + " Energy level: " + character.energyLevel);
                    break;
                case 0:
                    System.out.println("Finishing program");
                default:
                    System.out.println("Invalid option");
            }
        }while(op != 0);

        sc.close();

    }
}