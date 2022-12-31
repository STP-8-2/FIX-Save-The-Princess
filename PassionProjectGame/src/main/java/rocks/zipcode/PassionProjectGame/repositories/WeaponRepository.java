package rocks.zipcode.PassionProjectGame.repositories;

import org.springframework.data.repository.CrudRepository;
import rocks.zipcode.PassionProjectGame.items.Weapon;

public interface WeaponRepository extends CrudRepository<Weapon, Long> {
}
