package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Api")

public class ControllerPrueba {

    @GetMapping
    public ResponseEntity<String> GetPruebas(){
        return ResponseEntity.ok("Hola me llamo Henry Culajay Carné: 7590-15-6649 y este es mi primer proyecto en Spring Boot en la nube");

    }
}


