package com.epam.spb.lection2;

public class BitOperations {
    public static void main(String[] args) {
        System.out.println("Bit operations");
        {
            int i = -1; //11111111111111111111111111111111
            i >>>= 10;  //00000000001111111111111111111111
            System.out.println(i);

            long l = -1;
            l >>>= 10;
            System.out.println(l);

            short s = -1;
            s >>>= 10;
            System.out.println(s);

            byte b = -1;
            b >>>= 10;
            System.out.println(b);
            b = -1;
            System.out.println(b >>> 10);
        }
    }
}
