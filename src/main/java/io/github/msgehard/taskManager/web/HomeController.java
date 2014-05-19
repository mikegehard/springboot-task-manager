package io.github.msgehard.taskManager.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @RequestMapping(value= "/", method = RequestMethod.GET)
    String home(Model model) {
        model.addAttribute("welcome", "Hello world!");
        return "home/index";
    }

    @RequestMapping(value= "/{name}", method = RequestMethod.GET)
    public String homeWithName(@PathVariable String name, Model model) {
        model.addAttribute("welcome", "Hello " + name + "!");
        return "home/index";
    }
}
