package rocks.zipcode.PassionProjectGame.repositories.characters;

import org.springframework.data.repository.CrudRepository;
import rocks.zipcode.PassionProjectGame.characterModels.Enemy;

public interface EnemyRepository extends CrudRepository <Enemy, Long> {
}
