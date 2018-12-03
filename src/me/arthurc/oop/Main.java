package me.arthurc.oop;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("小汪");
        Cat cat = new Cat("小喵");
        Bird bird = new Bird("小飛");
        FlyDog flyDog = new FlyDog("飛天狗");

        printAnimalName(dog);
        printAnimalName(cat);
        printAnimalName(bird);
        printAnimalName(flyDog);

        System.out.println("----------------------------");

        letAnimalFly(flyDog);
        letAnimalFly(bird);
    }

    private static void printAnimalName(Animal animal) {
        animal.sayHello();
    }

    private static void letAnimalFly(FlyAble flyAble) {
        flyAble.fly();
    }
}
