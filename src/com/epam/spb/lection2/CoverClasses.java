package com.epam.spb.lection2;

public class CoverClasses {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        System.out.println("i1=" + i);
        changeInteger(i);
        System.out.println("i2=" + i);
    }

    public static void changeInteger(Integer x) {
        System.out.println("x1=" + x);
        x = new Integer(20);
        System.out.println("x2=" + x);
    }
}
