package com.example.demo.Atai;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component

@Scope(WebApplicationContext.SCOPE_APPLICATION)
public class ApplicationScopedBean {
    private final String appData = "Global Application Data";

    public String getAppData() {
        return appData;
    }
}
