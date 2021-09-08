package tn.smartoffice.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRessource {
    @RequestMapping({"/Hello"})
    public String hello()
    {
        return "Hello Mohamed Elhedi Ben Yedder";
    }
}
