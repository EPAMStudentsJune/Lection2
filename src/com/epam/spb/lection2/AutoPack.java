package com.epam.spb.lection2;

public class AutoPack {

    public static void main(String[] args) {
        System.out.println("Autopack");
        Integer j = 71; // создание объекта+упаковка
        Integer k = ++j; // распаковка+операция+упаковка
        int i = 2;
        k = i + j + k;
        System.out.println(k);

        // dirty hack - cache
        {
            Integer i1 = 10;
            Integer i2 = 10;
            System.out.println(i1 == i2);

            i1 = 128;
            i2 = 128;
            System.out.println(i1 == i2);
        }

        {
            Number n1 = 1;
            Number n2 = 7.1;
            Number[] array = {71, 7.1, 7L};
            Integer i1 = (Integer) n1;
            Integer i2 = (Integer) n2; // runtime error
            Integer[] i3 = (Integer[]) array; // runtime error

        }
    }

}
