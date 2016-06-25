package com.epam.spb.lection2;

public class LogicOperations {

    public static void main(String[] args) {
        System.out.print("true ");
        if(bFalse()&&bTrue());
        System.out.println();

        if(bFalse()&bTrue());
        System.out.println();
    }

    private static boolean bTrue() {
        System.out.print("true ");
        return true;
    }

    private static boolean bFalse() {
        System.out.print("false ");
        return false;
    }

}
