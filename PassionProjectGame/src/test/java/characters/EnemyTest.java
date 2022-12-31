package characters;

import org.junit.jupiter.api.Test;
import rocks.zipcode.PassionProjectGame.characterModels.Enemy;
import rocks.zipcode.PassionProjectGame.items.Consumables;
import rocks.zipcode.PassionProjectGame.items.Item;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnemyTest {
    //TODO test constructors, setters
//    @Test
//    public void testNullaryConstructor(){
//        //given an enemy
//        Enemy tank = new Enemy();
//        //when
//        Inventory drops = new Inventory();
//        String enemyName = "Tank";
//        //then
//        assertNull(tank.getName());
//        assertNull(tank.getEnemyInventory());
//    }
//    @Test
//    public void testNonNullaryConstructor(){
//        //given things an enemy can have
//        String expectedName = "Witch";
//        Inventory drops = new Inventory();
//        ArrayList<Item> held = new ArrayList<>();
//        drops.setItemStash(held);
//        Consumables potion = new Consumables();
//        Consumables key = new Consumables();
//        held.add(key);
//        held.add(potion);
//        //when the enemy exists
//        Enemy witch = new Enemy(expectedName, held);
//        //then the fields are not null
//        assertNotNull(witch.getEnemyInventory());
//        assertEquals(expectedName, witch.getName());
//    }
//    @Test
//    public void testSetName(){
//        //given an Enemy
//        Enemy wesker = new Enemy();
//        //when you set the name
//        String name = "Albert";
//        wesker.setName(name);
//        //then his name is the name you set
//        assertEquals(wesker.getName(), name);
//    }
//    @Test
//    public void testSetEnemyInventory(){
//        //given
//        Enemy ganon = new Enemy();
//        Consumables potion = new Consumables();
//        Inventory inventory = new Inventory();
//        inventory.setItemStash(inventory.getItemStash());
//        ArrayList list = inventory.getItemStash();
//        list.add(potion);
//        ganon.setEnemyInventory(list);
//        //when
//        //then
//        assertNotNull(ganon.getEnemyInventory());
//    }
//    @Test
//    public void enemyStats(){
//        Enemy pucci = new Enemy();
//        pucci.setStats(pucci.getStats());
//        Stats stats = pucci.getStats();
//        stats.setStamina(80);
//        stats.setSpeed(1000);
//        stats.setHealth(50);
//        stats.setDefense(90);
//        stats.setAttack(100);
//        assertNotNull(pucci.getStats());
//    }
}
