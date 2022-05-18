package Service;

import model.Greeting;
import model.User;

public class GreetingService  implements IGreetingService
{
    private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(message));
    }
}
