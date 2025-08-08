package br.com.fiap.game.view;

import br.com.fiap.game.model.MagicalCharacter;
import br.com.fiap.game.model.SpecialSkill;
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

                    character.setName(name);
                    character.setMagicalPower(power);
                    character.setEnergyLevel(energy);

                    System.out.println("Enter the special skill name: ");
                    String skillName = sc.next() + sc.nextLine();

                    System.out.println("Enter the energy cost to use the special skill: ");
                    int energyCost = sc.nextInt();

                    System.out.println("The skill is activated? (true/false): ");
                    boolean activated = sc.nextBoolean();

                    // Creating the object who represents the special skill with user's value
                    SpecialSkill specialSkill = new SpecialSkill(skillName, energyCost, activated);
                    character.setSpecialSkill(specialSkill);
                    break;

                case 2:
                    System.out.println("Name: " + character.getName() + " Power: " + character.getMagicalPower() + " Energy level: " + character.getEnergyLevel());
                    System.out.println("Skill: " + character.getSpecialSkill().getName() + " Energy cost: " + character.getSpecialSkill().getEnergyCost() + " Activated: " + character.getSpecialSkill().isActivated());
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
                    character.getSpecialSkill().activateSpecialSkill();
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
