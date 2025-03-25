package com.mackenzie.JavaProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index"; // O arquivo deve estar em src/main/resources/templates/
    }
}
