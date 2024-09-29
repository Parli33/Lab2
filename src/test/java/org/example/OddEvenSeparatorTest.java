package org.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSeparatorTest {

    @Test
    void even() {
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();
        oddEvenSeparator.addNumber(5);
        oddEvenSeparator.addNumber(11);
        oddEvenSeparator.addNumber(4);
        oddEvenSeparator.addNumber(2);
        assertEquals(expected, oddEvenSeparator.getEvenList());
    }


    @Test
    void odd() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(11);
        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();
        oddEvenSeparator.addNumber(5);
        oddEvenSeparator.addNumber(11);
        oddEvenSeparator.addNumber(4);
        oddEvenSeparator.addNumber(2);
        assertEquals(expected, oddEvenSeparator.getOddList());

    }
}