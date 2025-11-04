package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexCotroller {

    @GetMapping("/index")
    public String home() {
        return "index"; // busca el archivo index.html o index.jsp
    }
}
 
