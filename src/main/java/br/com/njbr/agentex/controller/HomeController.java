package br.com.njbr.agentex.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/")
    public String getMethodName() {
        return new String("Home Selecionada com maven 4.0.0");
    }
    
    
}
