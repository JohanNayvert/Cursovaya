package com.skyeng;

public class Employee {

    private final String person;
    private String department;
    private double salary;
    private final int id;
    private static int count = 0;

    public Employee(String person, String department, double salary) {
        this.person = person;
        this.department = department;
        this.salary = salary;
        count++;
        id = count;
    }

    public String getPerson() {
        return person;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "Ф.И.О. - " + person +
                "; Место работы - " + department +
                "; Зарплата - " + salary;
    }
}
