package rocks.zipcode.PassionProjectGame.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.PassionProjectGame.items.Weapon;
import rocks.zipcode.PassionProjectGame.services.WeaponService;

@RestController
public class WeaponController {

    @Autowired
    WeaponService weaponService;

    public WeaponController(WeaponService service) {
        this.weaponService = service;
    }

    @GetMapping("/bakers")
    public ResponseEntity<Iterable<Weapon>> index() {
        return new ResponseEntity<>(weaponService.index(), HttpStatus.OK);
    }

    @GetMapping("/baker/{id}")
    public ResponseEntity<Weapon> show(@PathVariable Long id) {
        return new ResponseEntity<>(weaponService.show(id), HttpStatus.OK);
    }

    @PostMapping("/baker")
    public ResponseEntity<Weapon> create(@RequestBody Weapon weapon) {
        return new ResponseEntity<>(weaponService.create(weapon), HttpStatus.CREATED);
    }

    @PutMapping("/baker/update/{id}")
    public ResponseEntity<Weapon> update(@PathVariable Long id, @RequestBody Weapon weapon) {
        return new ResponseEntity<>(weaponService.update(id, weapon), HttpStatus.OK);
    }

    @DeleteMapping("/baker/delete/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(weaponService.delete(id), HttpStatus.OK);
    }
}

