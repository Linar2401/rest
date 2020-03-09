package ru.linar.rest.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
public class TestController {
    @GetMapping("/b")
    public String index(ModelMap map) {
        return "index";
    }

}
