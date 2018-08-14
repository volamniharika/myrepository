package com.example.autowiringdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class B {


    public String message()
    {
        return "welcome";
    }

}
