package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CaaService;
import web.service.CaaServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(name = "")
public class HelloController {

    private CaaService caaService = new CaaServiceImp();

    @GetMapping(value = "")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String say(@RequestParam(value = "count", required = false) Integer x, Model model) {
        model.addAttribute("massage", caaService.get(x, caaService.createCar()));
        return "cars";
    }
}