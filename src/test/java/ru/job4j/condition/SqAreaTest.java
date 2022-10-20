package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K3Square4dot687() {
        double expected = 4.6875;
        int p = 10;
        double k = 3;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP20K2Square22dot222() {
        double expected = 22.222;
        int p = 20;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.001);
    }
}