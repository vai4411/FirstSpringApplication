package com.bl.firstspringapp.controller;

import com.bl.firstspringapp.model.Greeting;
import com.bl.firstspringapp.model.User;
import com.bl.firstspringapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    IGreetingService greetingService;

    @GetMapping("")
    public Greeting greeting(@RequestBody Greeting greeting) {
        return greetingService.addGreeting(greeting);
    }

    @GetMapping("/display/{id}")
    public Greeting getGreeting(@PathVariable int id) {
        return greetingService.getGreetingById(id);
    }

    @PostMapping("")
    public void add(@RequestBody Greeting greeting) {
        greetingService.save(greeting);
    }

    @GetMapping("/{id}")
    public Greeting display(@PathVariable int id) {
        return greetingService.display(id);
    }
}
