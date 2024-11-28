package com.example.demo.Atai;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    private int counter = 0;

    public int getCounter() {
        return counter++;
    }
}
