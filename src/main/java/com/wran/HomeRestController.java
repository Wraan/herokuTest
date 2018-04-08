package com.wran;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @GetMapping("/")
    public String returnGreeting(){
        return "Hello World";
    }

    @PostMapping("/")
    public String returnPong(){
        return "Pong";
    }

    @GetMapping("/user")
    public User showUser(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("testpass");
        return user;
    }
}
