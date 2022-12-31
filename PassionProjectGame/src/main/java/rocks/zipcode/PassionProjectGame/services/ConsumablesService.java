package rocks.zipcode.PassionProjectGame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.PassionProjectGame.items.Consumables;
import rocks.zipcode.PassionProjectGame.repositories.ConsumablesRepository;

@Service
public class ConsumablesService {

    @Autowired
    ConsumablesRepository consumablesRepository;

    public ConsumablesService(ConsumablesRepository repository){this.consumablesRepository = repository;}

    public Iterable<Consumables> index() {
        return consumablesRepository.findAll();
    }

    public Consumables show(Long id) {
        return consumablesRepository.findById(id).get();
    }

    public Consumables create(Consumables baker) {
        return consumablesRepository.save(baker);
    }

    public Consumables update(Long id, Consumables newConsumablesData) {
        Consumables originalConsumables = consumablesRepository.findById(id).get();
        originalConsumables.setHealth(newConsumablesData.getHealth());
        return consumablesRepository.save(originalConsumables);
    }

    public Boolean delete(Long id) {
        consumablesRepository.deleteById(id);
        return true;
    }
}

