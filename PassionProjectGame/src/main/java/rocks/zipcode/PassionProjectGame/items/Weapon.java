package rocks.zipcode.PassionProjectGame.items;

import jakarta.persistence.*;

@Entity
public class Weapon extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public Weapon() {
    }

    public Weapon(String name, Integer strength) {
        this.setName(name);
        this.setStrength(strength);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

