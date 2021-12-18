package ciclo4.reto4.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import ciclo4.reto4.modelo.Cookware;

public interface InterfaceCookware extends MongoRepository<Cookware, String> {
    
}
