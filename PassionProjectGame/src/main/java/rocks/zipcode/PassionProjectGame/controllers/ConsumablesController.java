package rocks.zipcode.PassionProjectGame.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.PassionProjectGame.items.Consumables;
import rocks.zipcode.PassionProjectGame.services.ConsumablesService;

@Controller
@RequestMapping(value = "/consumables")
public class ConsumablesController {

    @Autowired
    ConsumablesService consumablesService;

    public ConsumablesController(ConsumablesService service) {
        this.consumablesService = service;
    }

    @GetMapping("/bakers")
    public ResponseEntity<Iterable<Consumables>> index() {
        return new ResponseEntity<>(consumablesService.index(), HttpStatus.OK);
    }

    @GetMapping("/baker/{id}")
    public ResponseEntity<Consumables> show(@PathVariable Long id) {
        return new ResponseEntity<>(consumablesService.show(id), HttpStatus.OK);
    }

    @PostMapping("/baker")
    public ResponseEntity<Consumables> create(@RequestBody Consumables baker) {
        return new ResponseEntity<>(consumablesService.create(baker), HttpStatus.CREATED);
    }

    @PutMapping("/baker/update/{id}")
    public ResponseEntity<Consumables> update(@PathVariable Long id, @RequestBody Consumables consumables) {
        return new ResponseEntity<>(consumablesService.update(id, consumables), HttpStatus.OK);
    }

    @DeleteMapping("/baker/delete/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(consumablesService.delete(id), HttpStatus.OK);
    }
}
