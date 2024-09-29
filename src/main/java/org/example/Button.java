package org.example;

public class Button {
    private int clickCount = 0;

    public void touch() {
        clickCount += 1;
    }

    public int getClickCount() {
        return clickCount;
    }
}
