package com.bl.firstspringapp.service;

import com.bl.firstspringapp.model.Greeting;
import com.bl.firstspringapp.model.User;
import com.bl.firstspringapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(Greeting greeting) {
        String message = String.format(template,(greeting.toString().isEmpty()) ? "Hello World" : greeting.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return greetingRepository.findById(id).get();
    }

    @Override
    public void save(Greeting greeting) {
        greeting.setCounter(counter.incrementAndGet());
        greetingRepository.save(greeting);
    }

    @Override
    public Greeting display(long id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        Greeting greeting1 = greeting.get();
        return greeting1;
    }
}
