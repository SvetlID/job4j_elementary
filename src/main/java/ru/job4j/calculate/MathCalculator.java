package ru.job4j.calculate;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double sumTotal(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + sub(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subAndDiv равен: " + subAndDiv(20, 10));
        System.out.println("Результат расчета sumTotal равен: " + sumTotal(10, 20));
    }
}