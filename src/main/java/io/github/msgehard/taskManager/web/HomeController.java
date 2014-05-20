package io.github.msgehard.taskManager.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value= "/", method = RequestMethod.GET)
    String home(Model model) {
        model.addAttribute("welcome", "Welcome to the task manager!");
        return "home/index";
    }
}
