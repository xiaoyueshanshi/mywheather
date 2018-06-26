package com.spring.wheather.mywheather.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestControl {
    @RequestMapping(value = "/hello",method =RequestMethod.GET)
    public String sayhello()
    {
        return "hello";
    }

}
