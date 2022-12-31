package rocks.zipcode.PassionProjectGame.repositories.characters;

import org.springframework.data.repository.CrudRepository;
import rocks.zipcode.PassionProjectGame.characterModels.Hero;

public interface HeroRepository extends CrudRepository<Hero, Long> {
}
