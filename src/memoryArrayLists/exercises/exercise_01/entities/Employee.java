package memoryArrayLists.exercises.exercise_01.entities;

public class Employee {
    private final Integer id;
    private final String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void increaseSalary(double percentage) {
        salary *= 1 + percentage / 100;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, name, salary);
    }
}
