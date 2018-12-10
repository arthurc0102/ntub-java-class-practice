package me.arthurc.class_20181015;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice01 {

    public static void main(String[] args) {
        // Case 1
        for (int i = 1; i < 6; i++) {
            System.out.printf("%5s\n", repeat("*", i));
        }

        System.out.println(repeat("-", 10));

        // Case 2
        System.out.print(IntStream.range(1, 6)
                .mapToObj(i -> String.format("%5s\n", repeat("*", i)))
                .collect(Collectors.joining()));

        System.out.println(repeat("-", 10));
    }

    private static String repeat(String str, int time) {
        return new String(new char[time]).replace("\0", str);
    }

}
