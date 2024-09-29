package org.example;

import java.util.Arrays;

public class Table {
    private final int[][] table;
    private final int rows;
    private final int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        table = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return table[row][col];
    }

    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    public int rows() {
        return rows;
    }

    public int cols() {
        return cols;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            str.append(Arrays.toString(table[i]));
        }
        return str.toString();
    }

    public double average() {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += table[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }
}

