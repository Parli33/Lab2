package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {

    @Test
    void getClickCount() {
        Button button = new Button();
        button.touch();
        button.touch();
        assertEquals(2, button.getClickCount());
    }


}