package io.github.msgehard.taskManager.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {
    @RequestMapping(value= "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("home/index");
        view.addObject("message", "Welcome to the task manager!");

        return view;
    }
}
