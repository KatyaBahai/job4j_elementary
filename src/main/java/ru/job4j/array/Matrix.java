package ru.job4j.array;

import java.io.FileOutputStream;
import java.io.IOException;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                table[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        try (FileOutputStream file = new FileOutputStream("C:/projects/job4j_design/data/dataresult.txt")) {
            int[][] table = multiple(9);
            for (int[] ints : table) {
                for (int cell = 0; cell < table.length; cell++) {
                    String temp = String.valueOf(ints[cell]);
                    file.write(temp.getBytes());
                    file.write(" ".getBytes());
                }
                file.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
