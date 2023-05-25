package oop.enumerationComposition.exercises.exercise01.entities;

import oop.enumerationComposition.exercises.exercise01.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department.getName();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public Double income(Integer month, Integer year) {
        double totalIncome = baseSalary;
        for (HourContract contract : contracts) {
            int contractYear = contract.getDate().getYear();
            int contractMonth = contract.getDate().getMonthValue();
            if (contractMonth == month && contractYear == year) {
                totalIncome += contract.totalValue();
            }
        }
        return totalIncome;
    }
}
