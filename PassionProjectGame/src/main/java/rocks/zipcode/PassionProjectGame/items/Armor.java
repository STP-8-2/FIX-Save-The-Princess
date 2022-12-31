package rocks.zipcode.PassionProjectGame.items;

import jakarta.persistence.*;

@Entity
public class Armor extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public Armor() {
    }

    public Armor(String name, Integer defense) {
        this.setName(name);
        this.setDefense(defense);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

