package me.arthurc.class_1015;

public class Practice02 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i > 0 && i < 10) {
            while (j > 0 && j < 10) {
                if (j != 1) {
                    System.out.print(" | ");
                }

                System.out.printf("%d * %d = %2d", i, j, i * j);

                j++;
            }

            i++;
            j = 1;

            System.out.print("\n");
        }
    }

}
