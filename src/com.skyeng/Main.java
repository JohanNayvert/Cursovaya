package com.skyeng;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cursovaya_1");
        System.out.println();

        EmployeeService employeeService = new EmployeeService();

        employeeService.getPrintEmployeesList();
        employeeService.getSumSalary();
        employeeService.getMinSalary();
        employeeService.getMaxSalary();
        employeeService.getMeanSalary();
        employeeService.getPrintPersonList();

        System.out.println();
        System.out.println("HomeWork Complete");
    }
}
