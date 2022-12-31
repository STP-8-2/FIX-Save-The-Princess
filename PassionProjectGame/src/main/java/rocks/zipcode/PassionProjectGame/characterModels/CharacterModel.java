package rocks.zipcode.PassionProjectGame.characterModels;

import rocks.zipcode.PassionProjectGame.items.Item;
import rocks.zipcode.PassionProjectGame.utility.Stats;

import java.util.ArrayList;

public abstract class CharacterModel {
    //    private Long id;
    private String name;
    //    public Inventory inventory;
    public Stats stats;

    public ArrayList<Item> inventory;

    public CharacterModel(){
        this.stats = new Stats();
    }

    public CharacterModel(String characterName){
        this.name = characterName;
        this.stats = new Stats();
    }
    public CharacterModel(String characterName, ArrayList<Item> inventory) {
        this.name = characterName;
        this.inventory = inventory;
        this.stats = new Stats();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    //TODO complete attack method with weapons later
    public void attack(){}
}
