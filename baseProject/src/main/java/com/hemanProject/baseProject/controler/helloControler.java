package com.hemanProject.baseProject.controler;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {
    @GetMapping("/")
    public String toString() {
        return "Hello Heman is Side";
    }
}
