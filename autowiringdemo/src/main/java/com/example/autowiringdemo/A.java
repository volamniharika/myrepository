package com.example.autowiringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class A {

    @Qualifier("e")
    @Autowired
    i1 b;

    @RequestMapping(value="/add",method= RequestMethod.GET)
    @ResponseBody
    String message()
    {
       return b.add(1,2);
    }



    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
