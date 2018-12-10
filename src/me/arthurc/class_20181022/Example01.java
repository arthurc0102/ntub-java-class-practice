package me.arthurc.class_20181022;

public class Example01 {

    public static void main(String[] args) {
        int num = 0;
        int[][] targets = {{1, 0, 0, 1, 0}, {1, 0, 1, 1, 0}, {1, 1, 1, 1, 0}};

        for (int[] target: targets) {
            for (int item: target) {
                if (item == 0) {
                    break;
                }

                num++;
            }
        }

        System.out.printf("遇到 0 之前總共有 %d 個 1\n", num);
    }

}
