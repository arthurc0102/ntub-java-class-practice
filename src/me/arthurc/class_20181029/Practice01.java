package me.arthurc.class_20181029;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice01 {

    public static void main(String[] args) {
        int[] target = {23, 100, 58, 11, 67, 12, 44, 101, 75};

        printArray("排序前：", target);
        printArray("排序後：", ascBubbleSort(target));

        System.out.print("您想要找的數字：");
        Scanner scanner = new Scanner(System.in);

        int search = scanner.nextInt();
        int resultIndex = binarySearch(search, target);

        if (resultIndex < 0) {
            System.out.printf("找不到數字 %d\n", search);
        } else {
            System.out.printf("數字 %d 再排序後的第 %d 個數字\n", search, resultIndex);
        }

        scanner.close();
    }

    private static int[] ascBubbleSort(int[] target) {
        for (int i = target.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (target[j] >= target[j + 1]) {
                    continue;
                }

                int tmp = target[j];
                target[j] = target[j + 1];
                target[j + 1] = tmp;
            }
        }

        return target;
    }

    private static int binarySearch(int search, int[] target) {
        int start = 0;
        int end = target.length - 1;

        do {
            int middle = (start + end) / 2;

            if (target[middle] == search) {
                return middle;
            }

            if (target[middle] > search) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        } while (start <= end);

        return -1;
    }

    private static void printArray(int[] array) {
        String output = IntStream.of(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(output);
    }

    private static void printArray(String prefix, int[] array) {
        System.out.print(prefix);
        printArray(array);
    }

}
