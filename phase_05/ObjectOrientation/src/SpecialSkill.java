public class SpecialSkill {
    String name;
    int energyCost;
    boolean activated;

    public SpecialSkill(String name, int energyCost, boolean activated) {
        this.name = name;
        this.energyCost = energyCost;
        this.activated = activated;
    }

    public void activateSpecialSkill() {
        activated = true;
    }
}