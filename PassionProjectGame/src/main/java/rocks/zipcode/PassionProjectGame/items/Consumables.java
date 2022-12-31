package rocks.zipcode.PassionProjectGame.items;

import jakarta.persistence.*;

@Entity
public class Consumables extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public Consumables() {
    }

    public Consumables(String name, Integer health) {
        this.setName(name);
        this.setHealth(health);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

