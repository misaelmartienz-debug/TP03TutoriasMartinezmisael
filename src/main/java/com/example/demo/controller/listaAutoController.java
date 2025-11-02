package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class listaAutoController {

    @GetMapping("/")
    public String home() {
        return "tablaAuto"; // busca el archivo index.html o index.jsp
    }
}
 
