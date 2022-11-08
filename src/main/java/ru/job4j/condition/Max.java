package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result;
        if (first >= second && first >= third && first >= fourth) {
            result = first;
        } else if (second >= first && second >= third && second >= fourth) {
            result = second;
        } else {
            result = third >= fourth ? third : fourth;
        }
        return result;
    }
}
