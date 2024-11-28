package com.example.demo.Atai.controllers;

import com.example.demo.Atai.RequestScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestScopeController {

    private final RequestScopedBean requestScopedBean;

    @Autowired
    public RequestScopeController(RequestScopedBean requestScopedBean) {
        this.requestScopedBean = requestScopedBean;
    }

    @GetMapping("/requestData")
    public String getRequestData() {
        return requestScopedBean.getRequestData();
    }
}