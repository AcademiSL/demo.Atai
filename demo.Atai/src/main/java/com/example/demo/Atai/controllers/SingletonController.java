package com.example.demo.Atai.controllers;

import com.example.demo.Atai.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingletonController {

    @Autowired
    private SingletonBean singletonBean;

    @GetMapping("/singleton")
    public int getSingletonCounter() {
        return singletonBean.getCounter();
    }
}
