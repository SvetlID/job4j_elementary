package ru.job4j.calculate;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        double manWeight = Fit.manWeight(manHeight);
        short womanHeight = 170;
        double womanWeight = Fit.womanWeight(womanHeight);
        System.out.println("Man 180 is " + manWeight);
        System.out.println("Woman 170 is " + womanWeight);
    }
}
