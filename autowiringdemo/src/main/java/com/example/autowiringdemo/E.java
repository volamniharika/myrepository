package com.example.autowiringdemo;

import org.springframework.stereotype.Component;

@Component

public class E implements i1 {

    public String add(int a,int b)
    {
        int f=a+b;
        return f+"from class e";
    }
}
