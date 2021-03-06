package com.bl.firstspringapp.service;

import com.bl.firstspringapp.model.Greeting;
import com.bl.firstspringapp.model.User;

public interface IGreetingService {
    Greeting addGreeting(Greeting greeting);
    Greeting getGreetingById(long id);
    void save(Greeting greeting);
    Greeting display(long id);
    void update(long id,Greeting greeting);
    void delete(long id);
}
