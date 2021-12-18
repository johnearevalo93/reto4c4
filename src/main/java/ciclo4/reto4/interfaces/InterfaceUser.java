package ciclo4.reto4.interfaces;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import ciclo4.reto4.modelo.User;

public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
