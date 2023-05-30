package oop.enumerationComposition.exercises.exercise02.entities;

import java.time.LocalDate;

import static oop.enumerationComposition.exercises.exercise02.entities.Order.dateFormatter;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate.format(dateFormatter);
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s", name, getBirthDate(), email);
    }
}
