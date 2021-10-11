package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // reading properties from properties file / injecting properties from properties file into our fields
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // expose "/" that return hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World, time on the server is : " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k...";
    }

    @GetMapping("/teamInfo")
    public String getTeamInfo() {
        return "Coach name: " + coachName + ", team name : " + teamName;
    }
}
