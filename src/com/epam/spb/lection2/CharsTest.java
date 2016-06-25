package com.epam.spb.lection2;

public class CharsTest {
    public static void main(String[] args) {
        char c = '9';
        Character ch = new Character(c);

        System.out.println("charValue() - " + ch.charValue());

        System.out.println("isJavaIdentifierStart? - " +
                Character.isJavaIdentifierStart(c));

        System.out.println("isLetter? - "
                +Character.isLetter(c));

        System.out.println("digit for 14 - " +
                Character.forDigit(14, 16));
    }
}
