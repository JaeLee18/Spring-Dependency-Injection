package com.jjlee.sfgdi.controllers;

import com.jjlee.sfgdi.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting(){
        return greetingService.sayHello();
    }
}
