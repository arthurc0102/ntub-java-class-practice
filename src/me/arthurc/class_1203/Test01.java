package me.arthurc.class_1203;

public class Test01 {

    public static void main(String[] args) {
        try {
            int a = division(4, 0);
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }

    public static int division(int n1, int n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException();
        }

        return (int) n1 / n2;
    }
}
