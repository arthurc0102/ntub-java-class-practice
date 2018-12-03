package me.arthurc.oop;

public class Bird extends Animal implements FlyAble {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am bird, I can fly.");
    }
}
