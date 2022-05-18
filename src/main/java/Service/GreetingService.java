package Service;

import model.Greeting;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import repository.GreetingRepository;

import java.util.Optional;

public class GreetingService  implements IGreetingService
{
    private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;


    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(message));
    }

    @Override
    public Optional<Greeting> findById(long id) {

        return greetingRepository.findById(id);
    }
}
