import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import rocks.zipcode.PassionProjectGame.characterModels.Hero;
import rocks.zipcode.PassionProjectGame.services.characters.HeroService;

@Configuration
public class HeroConfig {
    @Autowired
    private HeroService service;
    @PostConstruct
    public void setup(){
//        service.create(new Hero("Link"));
//        service.create(new Hero("Gon"));
//        service.create(new Hero("Sailor Moon"));
    }
}
