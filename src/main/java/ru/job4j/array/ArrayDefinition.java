package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);

        String[] surname = new String[100500];
        System.out.println(surname.length);

        float[] prices = new float[40];
        System.out.println(prices.length);
    }
}
