package oop.introduction.exercises.exercise04.util;

public class CurrencyConverter {
    public static final double IOF = 1.06;

    public static double usdToBrl(double usdPrice, double amount) {
        return usdPrice * amount * IOF;
    }
}
