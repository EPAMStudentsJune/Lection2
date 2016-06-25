package com.epam.spb.lection2;

public class StringTransformation {

    public static void main(String[] args) {
        System.out.println("StringTransformation");

        String strInt = "123";
        String strDouble= "123.24";
        int x;
        double y;
        double z;

        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println(x+y);

        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDouble=" + strDouble);

        String str;
        str = "num=" + 345;
        System.out.println(str);

        System.out.println(Integer.toString(267));
        System.out.println(Integer.toBinaryString(267));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));
    }
}
