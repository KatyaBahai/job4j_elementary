package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenXA3XB3YA4YB3Then1() {
        int xa = 3;
        int xb = 3;
        int ya = 4;
        int yb = 3;
        double expected = 1;
        double out = Point.distance(xa, xb, ya, yb);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenXA5XB10YA3YB4Then6dot324() {
        int xa = 5;
        int xb = 10;
        int ya = 3;
        int yb = 4;
        double expected = 6.324;
        double out = Point.distance(xa, xb, ya, yb);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenXA0XB1YA2YB3Then2dot828() {
        int xa = 0;
        int xb = 1;
        int ya = 2;
        int yb = 3;
        double expected = 2.828;
        double out = Point.distance(xa, xb, ya, yb);
        Assert.assertEquals(expected, out, 0.01);
    }
}