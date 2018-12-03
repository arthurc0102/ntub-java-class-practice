package me.arthurc.oop;

public class FlyDog extends Dog implements FlyAble {

    public FlyDog(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am dog but I can fly.");
    }

}
