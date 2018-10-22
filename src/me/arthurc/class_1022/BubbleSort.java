package me.arthurc.class_1022;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {
        int[] target = {7, 3, 4, 2, 1, 6, 5};

        for (int i = target.length - 2; i >=0 ; i--) {
            for (int j = 0; j <= i; j++) {
                if (target[j] <= target[j+1]) {
                    continue;
                }

                int tmp = target[j];
                target[j] = target[j+1];
                target[j+1] = tmp;
            }
        }

        String output = IntStream.of(target)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(output);
    }

}
