package com.jjlee.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("HelloWorld!");
        return "Hello, Folks!";
    }
}
