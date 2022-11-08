package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenXA5XB3YA10YB4Then6dot324() {
        Point point1 = new Point(5, 10);
        Point point2 = new Point(3, 4);
        double expected = 6.324;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenXA0XB20YA1YB3Then2dot828() {
        Point point1 = new Point(0, 1);
        Point point2 = new Point(2, 3);
        double expected = 2.828;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenXA0XB2YA0YB6Then4() {
        Point point1 = new Point(0, 2);
        Point point2 = new Point(0, 6);
        double expected = 4;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenXA0XB2XC4YA0YB6YC4Then4() {
        Point point1 = new Point(0, 2, 4);
        Point point2 = new Point(0, 6, 4);
        double expected = 4;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenXA0XB2XC6YA0YB6YC7Then4dot12() {
        Point point1 = new Point(0, 2, 6);
        Point point2 = new Point(0, 6, 7);
        double expected = 4.12;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenXA3XB3XC3YA3YB6YC7Then4dot12() {
        Point point1 = new Point(3, 3, 3);
        Point point2 = new Point(3, 6, 7);
        double expected = 5;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}