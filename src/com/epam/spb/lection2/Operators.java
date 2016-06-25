package com.epam.spb.lection2;

public class Operators {
    public static void main(String[] args) {
        String s = new String("one");
        switch (s) {
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            case "four":
                System.out.println("four");
                break;
            case "one":
                System.out.println("one");
                break;
            default:
                System.out.println("default");
        }

        int x = 10;
        switch (x) {
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            default:
                System.out.println("default");
            case 10:
                System.out.println("10");
            case 40:
                System.out.println("40");
        }

    }
}
