package me.arthurc.class_20181029;

public class Practice02 {

    public static void main(String[] args) {
        int result = factorial(3);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if (n < 0) {
            throw new java.lang.Error("Number should bigger than 0");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
