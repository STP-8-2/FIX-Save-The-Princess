package rocks.zipcode.PassionProjectGame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.PassionProjectGame.items.Weapon;
import rocks.zipcode.PassionProjectGame.repositories.WeaponRepository;

@Service
public class WeaponService {

    @Autowired
    WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository repository){this.weaponRepository = repository;}

    public Weapon show(Long id) {
        return weaponRepository.findById(id).get();
    }

    public Iterable<Weapon> index() {
        return weaponRepository.findAll();
    }

    public Weapon create(Weapon baker) {
        return weaponRepository.save(baker);
    }

    public Weapon update(Long id, Weapon newWeaponData) {
        Weapon weapon = weaponRepository.findById(id).get();
        weapon.setStrength(newWeaponData.getStrength());
        return weaponRepository.save(weapon);
    }

    public Boolean delete(Long id) {
        weaponRepository.deleteById(id);
        return true;
    }
}
