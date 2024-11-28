package com.example.demo.Atai.controllers;

import com.example.demo.Atai.SessionScopedBean;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionScopeController {

    private final SessionScopedBean sessionScopedBean;

    @Autowired
    public SessionScopeController(SessionScopedBean sessionScopedBean) {
        this.sessionScopedBean = sessionScopedBean;
    }

    @GetMapping("/sessionData")
    public String getSessionData() {
        return sessionScopedBean.getSessionData();
    }
}
