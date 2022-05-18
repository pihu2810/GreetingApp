package controller;


import model.Greeting;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class GreetingController
{
    private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();


    @Autowired
    private IGreetingService greet;

    @RequestMapping(value= {"","/","/home"})
    public String sayHello() {
        return "Hello from bridgelaz!!!!!";
    }








}
