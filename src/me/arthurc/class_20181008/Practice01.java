package me.arthurc.class_20181008;

import java.util.Date;

public class Practice01 {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.printf("現在是%1$tp，今天是%1$tA %1$tm/%1$td %1$tY 是今年以來的第 %1$tj 天\n", now);
    }

}
