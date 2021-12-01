package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl1 = y2 - y1;
        double first = Math.pow(rsl, 2);
        double second = Math.pow(rsl1, 2);
        double fin = first + second;
        return Math.sqrt(fin);

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(5, 4, 6, 8);
        System.out.println("result (5, 4) to (6, 8) " + result1);
        double result2 = Point.distance(4, 3, 2, 1);
        System.out.println("result (4, 3) to (2, 1) " + result2);
    }
}
