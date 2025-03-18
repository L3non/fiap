package br.com.fiap.game.model;

public class MagicalCharacter {
    private String name;
    private String magicalPower;
    private int energyLevel;

    private SpecialSkill specialSkill;

    public MagicalCharacter() {}

    public MagicalCharacter(String name) {
        this.name = name;
    }

    public void attack(String attack) {
        if (energyLevel >= 10) {
            System.out.println(name + " carried out an attack: " + attack + "!");
            energyLevel -= 10;
        } else {
            System.out.println(name + " has no energy to attack.");
        }
    }

    public int increaseEnergy(int energy) {
        this.energyLevel += energy;
        return energyLevel;
    }

    public void activateSpecialSkill() {
        if (!specialSkill.isActivated()) {
            System.out.println("Special skill is not activated.");

        } else if (energyLevel >= specialSkill.getEnergyCost()) {
            System.out.println("Activating the special skill: " + specialSkill.getName());
            energyLevel -= specialSkill.getEnergyCost();

        } else {
            System.out.println(name + " has no energy to use the special skill.");
        }
    }

    public void showDetails() {
        System.out.println(name + " Magical Power: " + magicalPower + " Energy Level: " + energyLevel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}
    public String getMagicalPower() {return magicalPower;}
    public void setMagicalPower(String magicalPower) {this.magicalPower = magicalPower;}
    public int getEnergyLevel() {return energyLevel;}
    public void setEnergyLevel(int energyLevel) {this.energyLevel = energyLevel;}
    public SpecialSkill getSpecialSkill() {return specialSkill;}
    public void setSpecialSkill(SpecialSkill specialSkill) {this.specialSkill = specialSkill;}
}
