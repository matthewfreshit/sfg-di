package com.matthewfreshit.sfgdi.controllers;

import com.matthewfreshit.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGretting();
    }
}
