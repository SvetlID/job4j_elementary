package ru.job4j.calculate;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight((short) 173);
        double woman = Fit.womanWeight((short) 162);
        System.out.println("Man 173 is " + man);
        System.out.println("Woman 162 is " + woman);
    }
}