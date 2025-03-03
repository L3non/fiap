public class MagicalCharacter {
    String name;
    int energyLevel;
    String magicalPower;

    SpecialSkill specialSkill;

    public MagicalCharacter(String name, int energyLevel, String magicalPower) {
        this.name = name;
        this.energyLevel = energyLevel;
        this.magicalPower = magicalPower;
    }

    public MagicalCharacter(String name) {this.name = name;}
    public MagicalCharacter() {}

    public void attack(String attack) {
        if (energyLevel >= 10) {
            System.out.println(name + " carried out an attack: " + attack + "!");
            energyLevel = energyLevel - 10;
        } else {
            System.out.println(name + " has no energy to attack.");
        }
    }

    public int increaseEnergy(int energy) {
        energyLevel = energyLevel + energy;
        return energyLevel;
    }

    public void activateSpecialSkill() {
        if (!specialSkill.activated) {
            System.out.println("Special skill is not activated");
        } else if (energyLevel >= specialSkill.energyCost) {
            System.out.println("Activating the special skill: " + specialSkill.name);
            energyLevel = energyLevel - specialSkill.energyCost;
        } else {
            System.out.println(name + " has no energy to special skill");
        }
    }
}
