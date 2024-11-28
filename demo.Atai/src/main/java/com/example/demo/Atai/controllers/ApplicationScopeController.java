package com.example.demo.Atai.controllers;


import com.example.demo.Atai.ApplicationScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationScopeController {

    @Autowired
    private ApplicationScopedBean applicationScopedBean;

    @GetMapping("/application-scope")
    public String getApplicationScopeData() {
        return applicationScopedBean.getAppData();
    }
}