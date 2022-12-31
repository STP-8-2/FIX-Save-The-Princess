package rocks.zipcode.PassionProjectGame.services.characters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.PassionProjectGame.characterModels.Hero;
import rocks.zipcode.PassionProjectGame.repositories.characters.HeroRepository;

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
    public Hero create(Hero hero){ return (Hero) repository.save(hero);}

    public Hero updateArmor(Long id, Hero newHeroData){
        Hero originalHero = (Hero) repository.findById(id).get();
        originalHero.setEquippedArmor(newHeroData.getEquippedArmor());
        if(originalHero.getEquippedArmor() == null){
            originalHero.setPlayerHasArmor(false);
        } else {originalHero.setPlayerHasArmor(true);}
        return (Hero) repository.save(originalHero);
    }
    public Hero updateWeapon(Long id, Hero newHeroData){
        Hero originalHero = (Hero) repository.findById(id).get();
        originalHero.setEquippedWeapon(newHeroData.getEquippedWeapon());
        if(originalHero.getEquippedWeapon() == null){
            originalHero.setPlayerHasWeapon(false);
        } else {originalHero.setPlayerHasWeapon(true);}
        return (Hero) repository.save(originalHero);
    }
    public Boolean delete(Long id){
        repository.deleteById(id);
        return true;
    }
}

