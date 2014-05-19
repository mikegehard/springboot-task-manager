package io.github.msgehard.taskManager;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping(value= "/", method = RequestMethod.GET)
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}