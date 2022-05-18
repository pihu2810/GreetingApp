package Service;

import model.Greeting;
import model.User;

import java.util.Optional;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Optional<Greeting> findById(long id);
}
