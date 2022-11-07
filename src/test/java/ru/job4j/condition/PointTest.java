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
}