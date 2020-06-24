package com.bl.firstspringapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    private long counter;

    public void setName(String name) {
        this.name = name;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    private String name;

    public long getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public Greeting() {
    }

    public Greeting(long counter, String name) {
        this.counter = counter;
        this.name = name;
    }
}
