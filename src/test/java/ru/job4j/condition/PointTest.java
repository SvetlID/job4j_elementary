package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when54to68then4dot12() {
        double expected = 4.12;
        int x1 = 5;
        int y1 = 4;
        int x2 = 6;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
        public void when43to21then2dot83() {
            double expected = 2.83;
            int x1 = 4;
            int y1 = 3;
            int x2 = 2;
            int y2 = 1;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void when22to74then5dot39() {
        double expected = 5.39;
        int x1 = 2;
        int y1 = 2;
        int x2 = 7;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        }

}