package characters;

import org.junit.jupiter.api.Test;
import rocks.zipcode.PassionProjectGame.characterModels.Hero;
import rocks.zipcode.PassionProjectGame.items.Armor;
import rocks.zipcode.PassionProjectGame.items.Consumables;
import rocks.zipcode.PassionProjectGame.items.Item;
import rocks.zipcode.PassionProjectGame.items.Weapon;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    //TODO testing constructors, set name, set weapon, set armor, has armor, has weapon
    //TODO test attack and stats later, as well as uncommenting the
    // nonnull constructor and retesting it to new inventory methods
//    @Test
//    public void testNullaryConstructor(){
//        //given a Hero
//        String characterName = "Jolyne";
//        Inventory inventory = new Inventory();
//        Hero jolyne = new Hero();
//        //when the hero has everything it needs
//        //then everything will probably be null??
//        assertNull(jolyne.getName());
//        assertNull(jolyne.getHeroInventory());
//    }
//    @Test
//    public void testNonNullaryConstructor(){
//        //given things a hero can have
//        String expectedName = "Cloud"; //theres one
//        Inventory expectedInventory = new Inventory();
//        ArrayList<Item> items = new ArrayList<>();
//        expectedInventory.setItemStash(items);
//        Consumables potion = new Consumables();
//        Consumables energyDrink = new Consumables();
//        items.add(potion);
//        items.add(energyDrink);
//        //cloud should have weapon and armor so that is three and four
//        Armor expectedArmor = new Armor("Iron Bangle", 10); //five
//        Weapon expectedWeapon = new Weapon("Buster Sword", 70); //six
//        //when he comes to existence
//        Hero cloud = new Hero(expectedName, items, true, true, expectedWeapon, expectedArmor);
//        //then the fields aren't null
//        assertTrue(cloud.getPlayerHasArmor() && cloud.getPlayerHasWeapon());
//        assertEquals(expectedName, cloud.getName());
//        assertNotNull(cloud.getHeroInventory());
//        assertEquals(expectedWeapon, cloud.getEquippedWeapon());
//        assertEquals(expectedArmor, cloud.getEquippedArmor());
//    }
//    @Test
//    public void testSetName(){
//        //given a hero
//        Hero sora = new Hero();
//        //when you set his name
//        sora.setName("Sora");
//        String expected = "Sora";
//        String actual = sora.getName();
//        //then his name should be the set name
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void setAilment(){
//        //given
//        Hero mirae = new Hero();
//        //when
//        mirae.setAilment(Ailment.POISONED);
//        Ailment expected = Ailment.POISONED;
//        Ailment actual = mirae.getAilment();
//        assertEquals(expected, actual);
//    }
    //    @Test
//    public void changeStatTest(){
//        //given a hero, the stat name, and the rate of change w/e
//        Hero link = new Hero();
//        int rateOfChange = 30;
//        link.setStats(link.getStats());
//        link.getStats().setHealth(20);
//        //when you call the method
//        link.changeStat(rateOfChange);
//        assertEquals(50,link.getStats().getHealth());
//        //then the change reflects in that stat
//    }
//    @Test
//    public void statsTest(){
//        Hero hero = new Hero();
//        hero.setStats(hero.getStats());
//        Stats stats = hero.getStats();
//        stats.setHealth(20);
//        stats.setSpeed(20);
//        stats.setStamina(40);
//        stats.setAttack(23);
//        stats.setDefense(56);
//        System.out.println(hero.getStats());
//        assertNotNull(hero.getStats());
//    }
}
