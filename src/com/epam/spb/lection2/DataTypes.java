package com.epam.spb.lection2;

public class DataTypes {

    boolean statusOn;
    double javaVar = 2.34;

    public static void main(String[] args) {
        int itemsSold = 04;
        double salary = 1.234e3;
        float itemCost = 11.0f;
        int i = 0xFd45, k$;
        double _interestRate;

        new StackRef();
        DataTypes dataTypes = new DataTypes();
        dataTypes.javaMethod();
        dataTypes.transformationDowngrading();
        dataTypes.transformationGrowing();
        dataTypes.notObvious();
        dataTypes.notObviousGrowing();
    }


    public void javaMethod() {
        long simpleVar = 1_000_000_000_000L;
        byte byteVar2 = 123;
    }





    public static class StackRef {

        public void first(){
            second();
        }

        public void second(){
            Car c =new Car("New car");
        }

    }

    public static class Car {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        public void rename(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }





    public void transformationGrowing() {
        int x = 200;
        long y = (long)x;
        long z = x;
        long value1 = (long)200; /* необязательно, т.к. компилятор
                            делает это автоматически */

    }


    public void transformationDowngrading() {
        long value2 = 1000L;
        int value3 = (int)value2; /* обязательно */
    }

    public void notObvious() {
        int x1 = 123456789;
        int x2 = 99999999;

        float f1 = x1;
        float f2 = x2;

        System.out.println("f1 - " + f1);
        System.out.println("f2 - " + f2);
    }

    public void notObviousGrowing() {
        float f1 = 1.2345f;
        double d1 = f1;
        double d2 = 1.2345;

        System.out.println("f1 - " + f1);
        System.out.println("d1 - " + d1);
        System.out.println("--------------------");

        System.out.printf("f1 = %.16f\n", f1);
        System.out.printf("d2 = %.16f\n", d2);


        {
            long l1 = 1234567891234L;
            float ff1 = l1;

            System.out.println("l1 - " + l1);
            System.out.println("f1 - " + ff1);
        }

    }

}
