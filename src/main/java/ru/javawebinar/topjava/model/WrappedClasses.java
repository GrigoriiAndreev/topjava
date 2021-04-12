package ru.javawebinar.topjava.model;

public class WrappedClasses {

    public static void main(String[] args) {

        int intNumber = 0;
        Integer integerNumber = Integer.valueOf(intNumber);
        System.out.println(intNumber);
        System.out.println(integerNumber);
        integerNumber = 20;
        System.out.println(integerNumber);
        String string1 = new String("immutable");
        System.out.println(string1);
        string1 = "muted";
        System.out.println(string1);

    }
}
