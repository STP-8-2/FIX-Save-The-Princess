package rocks.zipcode.PassionProjectGame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.PassionProjectGame.items.Armor;
import rocks.zipcode.PassionProjectGame.repositories.ArmorRepository;

@Service
public class ArmorService {

    @Autowired
    ArmorRepository armorRepository;

    public ArmorService(ArmorRepository repository){this.armorRepository = repository;}

    public Iterable<Armor> index() {
        return armorRepository.findAll();
    }

    public Armor show(Long id) {
        return armorRepository.findById(id).get();
    }

    public Armor create(Armor armor) {
        return armorRepository.save(armor);
    }

    public Armor update(Long id, Armor newArmorData) {
        Armor originalArmor = armorRepository.findById(id).get();
        originalArmor.setDefense(newArmorData.getDefense());
        return armorRepository.save(originalArmor);
    }

    public Boolean delete(Long id) {
        armorRepository.deleteById(id);
        return true;
    }
}

