package io.github.msgehard.taskManager.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value= "/", method = RequestMethod.GET)
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value= "/{name}", method = RequestMethod.GET)
    public String homeWithName(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
