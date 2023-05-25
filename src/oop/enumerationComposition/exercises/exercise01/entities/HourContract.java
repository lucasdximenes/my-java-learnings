package oop.enumerationComposition.exercises.exercise01.entities;

import java.time.LocalDate;

public class HourContract {
    private final LocalDate date;
    private final Double valuePerHour;
    private final Integer hours;

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }
}
