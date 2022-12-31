package rocks.zipcode.PassionProjectGame.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.PassionProjectGame.items.Armor;
import rocks.zipcode.PassionProjectGame.services.ArmorService;

@Controller
@RequestMapping(value ="/armor")
public class ArmorController {

    @Autowired
    private ArmorService armorService;

    public ArmorController(ArmorService service){this.armorService = service;}

    @GetMapping(value = "/readall")
    public ResponseEntity<Iterable<Armor>> index(){return new ResponseEntity<>(armorService.index(), HttpStatus.OK);}

    @GetMapping (value = "/{id}")
    public ResponseEntity<Armor> show(@PathVariable Long id){
        return new ResponseEntity<>(armorService.show(id), HttpStatus.OK);
    }
    @PostMapping(value = "/")
    public ResponseEntity<Armor> create (@RequestBody Armor armor){
        return new ResponseEntity<>(armorService.create(armor), HttpStatus.CREATED);
    }
    @PutMapping("/baker/update/{id}")
    public ResponseEntity<Armor> update(@PathVariable Long id, @RequestBody Armor armor) {
        return new ResponseEntity<>(armorService.update(id, armor), HttpStatus.OK);
    }
    @DeleteMapping (value="/delete")
    public ResponseEntity<Boolean> destroy(Long id){
        return new ResponseEntity<>(armorService.delete(id), HttpStatus.OK);
    }

}
