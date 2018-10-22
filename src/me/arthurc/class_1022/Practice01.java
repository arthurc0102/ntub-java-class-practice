package me.arthurc.class_1022;

public class Practice01 {

    public static void main(String[] args) {
        int x = 0, y = 10;

        do {
            y--;
            ++x;
        } while (x < 5);

        System.out.printf("%d, %d\n", x, y);
    }

}
