package me.arthurc.class_20181022;

import java.util.stream.IntStream;

public class Example02 {

    public static void main(String[] args) {
        int[] intArray = {56, 45, 68, 32};

        // Case1
        int total = 0;
        for (int item: intArray) {
            total += item;
        }

        System.out.println(total);

        // Case2
        System.out.println(IntStream.of(intArray).sum());
    }

}
