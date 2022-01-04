package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SquareAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SquareArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K3Square1dot17() {
        double expected = 1.17;
        int p = 5;
        double k = 3;
        double out = SquareArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K5Square5() {
        int expected = 5;
        int p = 12;
        double k = 5;
        double out = SquareArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K1Square2dot25() {
        double expected = 2.25;
        int p = 6;
        double k = 1;
        double out = SquareArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}

