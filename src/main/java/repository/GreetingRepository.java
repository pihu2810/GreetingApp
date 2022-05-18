package repository;

import model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class GreetingRepository {
    @Repository
    public interface GreetingRepository extends JpaRepository<Greeting, Long> {

    }
}
