package controller;


import Service.IGreetingService;
import model.Greeting;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping("/fullName")
    public Greeting sayWow(@RequestBody User user) {
        return greet.addGreeting(user);
    }

    @GetMapping("/find/{id}")
    public Optional<Greeting> greeting(@PathVariable(value = "id") long id)
    {
        return greet.findById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAll(){
        return greet.getAll();
    }

    @PutMapping("/editGreeting/{id}")
    public Optional<Greeting> editGreetingById(@PathVariable("id") long id, @RequestParam(value = "name") String name) {
        return greet.editGreetingById(id, name);
    }



}
