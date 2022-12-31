package rocks.zipcode.PassionProjectGame.controllers.characters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.PassionProjectGame.characterModels.Hero;
import rocks.zipcode.PassionProjectGame.services.characters.HeroService;

@Controller
@RequestMapping(value = "/hero")
public class HeroController {
    //TODO add methods for each update after editing stats class
    @Autowired
    private HeroService service;

    public HeroController(HeroService service){this.service = service;}

    @GetMapping(value = "/readall")
    public ResponseEntity<Iterable<Hero>> index(){return new ResponseEntity<>(service.index(), HttpStatus.OK);}

    @GetMapping (value = "/{id}")
    public ResponseEntity<Hero> show(@PathVariable Long id){
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }
    @PostMapping(value = "/")
    public ResponseEntity<Hero> create (@RequestBody Hero hero){
        return new ResponseEntity<>(service.create(hero), HttpStatus.CREATED);
    }
    @DeleteMapping (value="/delete")
    public ResponseEntity<Boolean> destroy(Long id){
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}

