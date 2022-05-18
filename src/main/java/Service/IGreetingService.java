package Service;

import model.Greeting;
import model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
}
