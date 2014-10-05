package io.github.msgehard.taskManager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String home(Model model) {
//        model.addAttribute("message", "Welcome to the task manager!");
//        return "home/index";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "Home";
    }
}
