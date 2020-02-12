package com.jjlee.sfgdi.controllers;

import com.jjlee.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
