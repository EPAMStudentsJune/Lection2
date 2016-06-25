package com.epam.spb.lection2;

public class ArgumentsExample {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println("Аргумент " + i + " = " + args[i]);
        }
    }
}
