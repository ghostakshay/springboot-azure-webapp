package com.ghost.webapp.azure_springboot_webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureWebAppRestController {

    @GetMapping("/test")
    public String test(){
        return "Welcome to Spring boot application deployment on azure web app! Akshay & Aditi Application";
    }


}
