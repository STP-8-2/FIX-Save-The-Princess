package rocks.zipcode.PassionProjectGame.utility;

public class Stats {
    private Integer attack;
    private Integer health;
    private Integer speed;
    private Integer defense;
    private Integer stamina;
    private Integer attackCap;
    private Integer healthCap;
    private Integer speedCap;
    private Integer defenseCap;
    private Integer staminaCap;

    public Stats(){}

    public Stats(Integer defense, Integer attack, Integer stamina, Integer speed, Integer health) {
        this.defense = defense;
        this.speed = speed;
        this.health = health;
        this.attack = attack;
        this.stamina = stamina;
    }
    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getAttackCap() {
        return attackCap;
    }

    public void setAttackCap(Integer attackCap) {
        this.attackCap = attackCap;
    }

    public Integer getHealthCap() {
        return healthCap;
    }

    public void setHealthCap(Integer healthCap) {
        this.healthCap = healthCap;
    }

    public Integer getSpeedCap() {
        return speedCap;
    }

    public void setSpeedCap(Integer speedCap) {
        this.speedCap = speedCap;
    }

    public Integer getDefenseCap() {
        return defenseCap;
    }

    public void setDefenseCap(Integer defenseCap) {
        this.defenseCap = defenseCap;
    }

    public Integer getStaminaCap() {
        return staminaCap;
    }

    public void setStaminaCap(Integer staminaCap) {
        this.staminaCap = staminaCap;
    }
}
