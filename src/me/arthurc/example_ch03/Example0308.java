package me.arthurc.example_ch03;

public class Example0308 {

    private static String str = "";

    public static void main(String[] args) {
        b: for (int x = 2; x < 7; x++) {
            if (x == 3) continue;
            if (x == 5) break b;
            str = str + x;
        }

        System.out.println(str);
    }

}
