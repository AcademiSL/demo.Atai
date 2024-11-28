package com.example.demo.Atai.controllers;

import com.example.demo.Atai.PrototypeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterControllerPPP {

    @Autowired
    private ApplicationContext context; // Внедрение ApplicationContext

    @GetMapping("/incrementPPP")
    public String incrementCounter() {
        // Получаем новый экземпляр прототипного бина
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
        int currentCount = prototypeBean.getCounter(); // Получаем текущее значение счётчика
        return "Current count is: " + currentCount; // Возвращаем ответ
    }
}

