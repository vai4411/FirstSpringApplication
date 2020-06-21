package com.bl.firstspringapp.model;

public class Greeting {
    private final long counter;
    private final String name;

    public long getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public Greeting(long counter, String name) {

        this.counter = counter;
        this.name = name;
    }
}
