import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MagicalCharacter character = new MagicalCharacter();
        int op;

        do {
            System.out.println("Choose an option: \n1 - Register Character \n2 - Display Character \n3 - Attack \n4 - Increase Energy \n5 - Activate Special Skill \n6 - Enable Special Skill\n0 - Exit");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Enter the name of the character: ");
                    String name = sc.next() + sc.nextLine();

                    System.out.println("Enter the power of the character: ");
                    String power = sc.next() + sc.nextLine();

                    System.out.println("Enter the energy level of the character: ");
                    int energy = sc.nextInt();

                    character.name = name;
                    character.energyLevel = energy;
                    character.magicalPower = power;

                    System.out.println("Enter the special skill name: ");
                    String skillName = sc.next() + sc.nextLine();

                    System.out.println("Enter the energy cost to use the special skill: ");
                    int energyLevel = sc.nextInt();

                    System.out.println("The skill is activated? (true/false): ");
                    boolean activated = sc.nextBoolean();

                    // Creating the object who represents the special skill with user's value
                    SpecialSkill specialSkill = new SpecialSkill(skillName, energyLevel, activated);

                    // Assigning the object special skill to character
                    character.specialSkill = specialSkill;
                    break;

                case 2:
                    System.out.println("Name: " + character.name + " Power: " + character.magicalPower + " Energy level: " + character.energyLevel);
                    System.out.println("Skill: " + character.specialSkill.name + " Energy cost: " + character.specialSkill.energyCost + " Activated: " + character.specialSkill.activated);
                    break;

                case 3:
                    System.out.println("Enter attack name:");
                    String attack = sc.next() + sc.nextLine();
                    character.attack(attack);
                    break;

                case 4:
                    System.out.println("Enter the amount of energy:");
                    int amt = sc.nextInt();

                    int actualLevel = character.increaseEnergy(amt);
                    System.out.println("Actual energy level: " + actualLevel);
                    break;

                case 5:
                    character.activateSpecialSkill();
                    break;

                case 6:
                    character.specialSkill.activateSpecialSkill();
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
