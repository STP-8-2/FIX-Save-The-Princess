package rocks.zipcode.PassionProjectGame.services.characters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocks.zipcode.PassionProjectGame.characterModels.Enemy;
import rocks.zipcode.PassionProjectGame.repositories.characters.EnemyRepository;

@Service
public class EnemyService {
    @Autowired
    EnemyRepository repository;
    //TODO update method for stats

    public EnemyService(EnemyRepository repository){this.repository = repository;}

    public Iterable<Enemy> index(){return repository.findAll();}
    public Enemy show(Long id){
        return (Enemy) repository.findById(id).get();
    }
    public Enemy create(Enemy enemy){ return (Enemy) repository.save(enemy);}

    public Boolean delete(Long id){
        repository.deleteById(id);
        return true;
    }
}

