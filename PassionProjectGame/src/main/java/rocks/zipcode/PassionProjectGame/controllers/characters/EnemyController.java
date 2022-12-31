package rocks.zipcode.PassionProjectGame.controllers.characters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.PassionProjectGame.characterModels.Enemy;
import rocks.zipcode.PassionProjectGame.services.characters.EnemyService;

@Controller
@RequestMapping(value = "/enemy")
public class EnemyController {
    @Autowired
    private EnemyService service;
    public EnemyController(EnemyService service){this.service = service;}

    @GetMapping(value = "/readall")
    public ResponseEntity<Iterable<Enemy>> index(){
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Enemy> show(@PathVariable Long id){
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }
    @PostMapping(value = "/")
    public ResponseEntity<Enemy> create(@RequestBody Enemy enemy){
        return new ResponseEntity<>(service.create(enemy), HttpStatus.CREATED);
    }
    //TODO uncomment this when update method is added in service
//    @PutMapping (value= "/update")
//    public ResponseEntity<Enemy> update(Long id, @RequestBody Enemy enemy){
//        return new ResponseEntity<>(service.update(id, baker), HttpStatus.OK);
//    }
    @DeleteMapping (value = "/delete")
    public ResponseEntity<Boolean> destroy(Long id){
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
