package rocks.zipcode.PassionProjectGame.services.characters;

import dto.CharCreationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.PassionProjectGame.characterModels.Hero;
import rocks.zipcode.PassionProjectGame.items.Armor;
import rocks.zipcode.PassionProjectGame.items.Weapon;
import rocks.zipcode.PassionProjectGame.repositories.characters.HeroRepository;
import rocks.zipcode.PassionProjectGame.utility.Stats;

@Service
public class HeroService {
    @Autowired
    HeroRepository repository;
    //TODO add methods for updating stats
    public HeroService(HeroRepository repository){this.repository = repository;}

    public Iterable<Hero> index(){return repository.findAll();}
    public Hero show(Long id){
        return (Hero) repository.findById(id).get();
    }
    public Hero create(CharCreationDTO charCreationDTO){
        Integer defense = charCreationDTO.getDefense();
        Integer attack = charCreationDTO.getAttack();
        Integer stamina = charCreationDTO.getStamina();
        Integer speed = charCreationDTO.getSpeed();
        Integer health = charCreationDTO.getHealth();
        Hero hero = new Hero();
        Stats stats = new Stats(defense, attack, stamina, speed, health);
        Armor armor = new Armor(charCreationDTO.getArmorName(), charCreationDTO.getArmorDefense());
        Weapon weapon = new Weapon(charCreationDTO.getWeaponName(), charCreationDTO.getWeaponAttack());
        hero.setName(charCreationDTO.getName());
        hero.setStats(stats);
        hero.setEquippedArmor(armor);
        hero.setEquippedWeapon(weapon);
        return repository.save(hero);
    }

    public Hero updateArmor(Long id, Hero newHeroData) {
        Hero hero1 = repository.findById(id).orElse(null);
        if (hero1 != null) {
            hero1.setStats(newHeroData.getStats());
            hero1.setEquippedArmor(newHeroData.getEquippedArmor());
            hero1.setPlayerHasArmor(hero1.getEquippedArmor() != null);
            return repository.save(hero1);
        }
        return repository.save(newHeroData);
    }

    public Hero updateWeapon(Long id, Hero newHeroData){
        Hero originalHero = repository.findById(id).get();
        originalHero.setEquippedWeapon(newHeroData.getEquippedWeapon());
        originalHero.setPlayerHasWeapon(originalHero.getEquippedWeapon() != null);
        return repository.save(originalHero);
    }
    public Boolean delete(Long id){
        repository.deleteById(id);
        return true;
    }
}

