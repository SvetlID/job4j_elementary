package ru.job4j.calculate;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 173;
        double manWeight = Fit.manWeight(manHeight);
        short womanHeight = 164;
        double womanWeight = Fit.womanWeight(womanHeight);
        System.out.println("Man 173 is " + manWeight);
        System.out.println("Woman 164 is " + womanWeight);
    }
}
