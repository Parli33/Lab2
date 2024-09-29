package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void getValue() {
        Table table = new Table(2,2);
        table.setValue(0,0,5);
        assertEquals(5,table.getValue(0,0));
    }

    @Test
    void rows() {
        Table table = new Table(2,2);
        assertEquals(2,table.rows());
    }

    @Test
    void cols() {
        Table table = new Table(2,2);
        assertEquals(2,table.cols());
    }

    @Test
    void testToString() {
        Table table = new Table(2,2);
        assertEquals(table.toString(),"[0, 0][0, 0]");
    }

    @Test
    void average() {
        Table table = new Table(2,2);
        table.setValue(0,0,2);
        table.setValue(1,0,2);
        table.setValue(0,1,4);
        table.setValue(1,1,4);
        assertEquals(3,table.average());
    }
}