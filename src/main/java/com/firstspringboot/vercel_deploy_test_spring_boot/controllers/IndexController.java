package com.firstspringboot.vercel_deploy_test_spring_boot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("")
    public String indexController(){
        return "index";
    }
}
