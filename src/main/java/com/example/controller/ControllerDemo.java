package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ControllerDemo {
    Logger logger = Logger.getLogger(ControllerDemo.class.getName());
    @GetMapping(value = "/demo")
    public String Demo(){
        logger.info("test log ne nha");
        return "xin chao tui la war new auto deploy";
    }
}
