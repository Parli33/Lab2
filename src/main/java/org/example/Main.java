package org.example;

import geometry2d.*;
import geometry3d.*;
import exceptions.ZeroVolumeException;
import exceptions.InvalidArgumentException;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.touch();
        button.touch();
        button.touch();
        System.out.println(button.getClickCount());

        Balance scales = new Balance();
        scales.addLeft(15);
        scales.addRight(25);
        scales.result();

        Bell bell = new Bell();
        bell.sound();
        bell.sound();

        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(5);
        separator.addNumber(3);
        separator.addNumber(2);
        separator.addNumber(9);
        System.out.println(separator.getOddList());
        System.out.println(separator.getEvenList());

        Table table = new Table(1, 3);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        System.out.println(table.getValue(0, 0));
        System.out.println(table.rows());
        System.out.println(table.cols());
        System.out.println(table.average());
        System.out.println(table);
        try {
            Circle circle = new Circle(3);
            circle.area();
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(4, 5);
            rectangle.area();
            System.out.println(rectangle);

            Cylinder cylinder = new Cylinder(circle, 5);
            System.out.println(cylinder.Volume());
            System.out.println(cylinder);

        } catch (ZeroVolumeException | InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }
}
