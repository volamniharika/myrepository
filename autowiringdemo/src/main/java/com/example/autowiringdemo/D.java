package com.example.autowiringdemo;

import org.springframework.stereotype.Component;

@Component

public class D implements i1 {

    public String add(int a,int b)
    {
        int c=a+b;
        return c+"form class d";
    }
}
