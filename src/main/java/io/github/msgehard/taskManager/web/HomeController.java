package io.github.msgehard.taskManager.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping(value= "/", method = RequestMethod.GET)
    String home() {
        return "Hello World!";
    }
}
