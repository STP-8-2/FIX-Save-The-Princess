package rocks.zipcode.PassionProjectGame.items;

public abstract class Item {

    private String name;
    private Integer defense;
    private Integer dexterity;
    private Integer energy;
    private Integer strength;
    private Integer intellect;
    private Integer speed;
    private Integer health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }
}
