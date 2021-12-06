package com.spring.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginResource {


    @GetMapping("/log")
    public  String getLogin(){

        return "Login Successful";
    }
}
