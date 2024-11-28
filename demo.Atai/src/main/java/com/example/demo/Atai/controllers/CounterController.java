package com.example.demo.Atai.controllers;

import com.example.demo.Atai.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    private final SingletonBean singletonBean;

    @Autowired
    public CounterController(SingletonBean singletonBean) {
        this.singletonBean = singletonBean;
    }

    @GetMapping("/increment")
    public String incrementCounter() {
        int currentCount = singletonBean.getCounter();
        return "Current count is: " + currentCount;
    }
}
