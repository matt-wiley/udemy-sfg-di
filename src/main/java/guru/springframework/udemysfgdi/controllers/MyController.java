package guru.springframework.udemysfgdi.controllers;

import guru.springframework.udemysfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
