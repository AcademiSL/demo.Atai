package com.example.demo.Atai;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    private int counter = 0;

    public int getCounter() {
        return counter++;
    }
}
