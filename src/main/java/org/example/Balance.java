package org.example;

public class Balance {
    private int weightOnTheLeft = 0, weightOnTheRight = 0;

    public void addRight(int weight) {
        weightOnTheRight += weight;
    }

    public void addLeft(int weight) {
        weightOnTheLeft += weight;
    }

    public void result() {
        if (weightOnTheRight > weightOnTheLeft) {
            System.out.println("R");
        } else if (weightOnTheRight < weightOnTheLeft) {
            System.out.println("L");
        } else System.out.println("=");
    }
}
