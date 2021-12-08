package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        return validate(x1) && validate(x2) && validate(y1) && validate(y2)
                && Math.abs(x2 - x1) == Math.abs(y2 - y1)
                ? Math.abs(x2 - x1) : 0;
    }

    public static boolean validate(int num) {
        return num >= 0 && num <= 7;
    }
}
