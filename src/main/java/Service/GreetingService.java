package Service;

import model.Greeting;
import model.User;

public class GreetingService  implements IGreetingService
{
    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(message));
    }
}
