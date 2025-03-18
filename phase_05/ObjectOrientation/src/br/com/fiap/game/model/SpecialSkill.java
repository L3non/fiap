package br.com.fiap.game.model;

public class SpecialSkill {
    private String name;
    private int energyCost;
    private boolean activated;

    public SpecialSkill(String name, int energyCost, boolean activated) {
        this.name = name;
        this.energyCost = energyCost;
        this.activated = activated;
    }

    public void activateSpecialSkill() { activated = true; }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getEnergyCost() {return energyCost;}
    public void setEnergyCost(int energyCost) {this.energyCost = energyCost;}
    public boolean isActivated() {return activated;}
    public void setActivated(boolean activated) {this.activated = activated;}
}
