package rocks.zipcode.PassionProjectGame.characterModels;

import jakarta.persistence.*;
import rocks.zipcode.PassionProjectGame.items.Armor;
import rocks.zipcode.PassionProjectGame.items.Item;
import rocks.zipcode.PassionProjectGame.items.Weapon;
import rocks.zipcode.PassionProjectGame.utility.Ailment;
import rocks.zipcode.PassionProjectGame.utility.Stats;

import java.util.ArrayList;

@Entity
public class Hero extends CharacterModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Boolean playerHasWeapon = false;
    private Boolean playerHasArmor = false;
    @Transient
    private Weapon equippedWeapon;
    @Transient
    private Armor equippedArmor;
    private Ailment ailment = Ailment.NORMAL;
//    @ManyToOne
//    private Stats stats;

    //TODO add ailment enum later
    //TODO add Stats field later


    public Hero(){

    }
    public Hero(String characterName){
        super(characterName);
        this.stats = new Stats();
    }

    public Hero(String characterName, ArrayList<Item> inventory, Boolean playerHasWeapon, Boolean playerHasArmor, Weapon equippedWeapon, Armor equippedArmor) {
        super(characterName, inventory);
        this.playerHasWeapon = playerHasWeapon;
        this.playerHasArmor = playerHasArmor;
        this.equippedWeapon = equippedWeapon;
        this. equippedArmor = equippedArmor;
        this.stats = new Stats();
    }
    public Hero(String characterName, ArrayList <Item> inventory, Boolean playerHasWeapon, Boolean playerHasArmor, Weapon equippedWeapon, Armor equippedArmor, Ailment ailment) {
        super(characterName, inventory);
        this.playerHasWeapon = playerHasWeapon;
        this.playerHasArmor = playerHasArmor;
        this.equippedWeapon = equippedWeapon;
        this. equippedArmor = equippedArmor;
        this.ailment = ailment;
        this.stats = new Stats();
    }

    public ArrayList<Item> getHeroInventory() {
        return inventory;
    }

    public void setHeroInventory(ArrayList <Item> inventory) {
        this.inventory = inventory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setEquippedWeapon(Weapon equippedWeapon){this.equippedWeapon = equippedWeapon;}

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(Armor equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    public Boolean getPlayerHasWeapon() {
        return playerHasWeapon;
    }

    public void setPlayerHasWeapon(Boolean playerHasWeapon) {
        this.playerHasWeapon = playerHasWeapon;
    }

    public Boolean getPlayerHasArmor() {
        return playerHasArmor;
    }

    public void setPlayerHasArmor(Boolean playerHasArmor) {
        this.playerHasArmor = playerHasArmor;
    }

    public Item useItem(Item itemToUse){
        Integer n = inventory.indexOf(itemToUse);
        return inventory.get(n);
    }
    public Ailment getAilment() {
        return ailment;
    }

    public void setAilment(Ailment ailment) {
        this.ailment = ailment;
    }

//    public void changeStat(String statName, int changeOfDebuff){
//        Map<String, Integer> map = heroStats.getCharacterStats();
//        int value = map.get(statName);
//        value = value + changeOfDebuff;
//        map.put(statName, value);
//        System.out.println(statName + " changed!!! New total is now " + value + ".");
//    }
}
