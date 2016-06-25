package com.epam.spb.lection2;

import static java.lang.Math.pow;
import static java.lang.Math.PI;


public class Import {

    public static void main(String[] args) {
        System.out.println("Import");
    }

    private int i = 20;

    public void staticImport() {
        double x;
        x = pow(i, 2)*PI;
        System.out.println("x=" + x);
    }

}
