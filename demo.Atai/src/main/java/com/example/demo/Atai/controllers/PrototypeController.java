package com.example.demo.Atai.controllers;

import com.example.demo.Atai.PrototypeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrototypeController {

    @Autowired
    private PrototypeBean prototypeBean;

    @GetMapping("/prototype")
    public int getPrototypeCounter() {
        return prototypeBean.getCounter();
    }
}
