package br.com.fiap.game.view;

public class Item {
    private String name;
    private String description;
    private boolean rare;
    private int powerLevel;

    public Item(String name, String description, boolean rare, int powerLevel) {
        this.name = name;
        this.description = description;
        this.rare = rare;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRare() {
        return rare;
    }

    public void setRare(boolean rare) {
        this.rare = rare;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }
}