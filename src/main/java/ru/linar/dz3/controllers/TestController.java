package ru.linar.dz3.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
public class TestController {
    @RequestMapping
    public String index(ModelMap map) {
        return "test";
    }

}
