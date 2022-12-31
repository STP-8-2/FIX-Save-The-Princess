package rocks.zipcode.PassionProjectGame.characterModels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import rocks.zipcode.PassionProjectGame.items.Item;
import rocks.zipcode.PassionProjectGame.utility.Stats;

import java.util.ArrayList;
@Entity
public class Enemy extends CharacterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    private Stats stats;

    public Enemy() {
    }

    public Enemy(String name) {
        super(name);
        this.stats = new Stats();
    }
    public Enemy(String characterName, ArrayList<Item> inventory){
        super(characterName, inventory);
        this.stats = new Stats();
    }

    public ArrayList<Item>  getEnemyInventory() {
        return inventory;
    }

    public void setEnemyInventory(ArrayList<Item>  inventory) {
        this.inventory = inventory;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void attack(){}
}
