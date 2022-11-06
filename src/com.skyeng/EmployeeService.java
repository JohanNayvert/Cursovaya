package com.skyeng;

public class EmployeeService {
    private final Employee[] employees;

    private EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    EmployeeService() {
        this.employees = new Employee[10];
        employees[0] = new Employee("Гончаров Сергей Владимирович", "Хозяйственный отдел", 19_500);
        employees[1] = new Employee("Зыков Артем Евтехиньевич", "Технический отдел", 48_300);
        employees[2] = new Employee("Романова Олеся Константиновна", "Административный отдел", 89_400);
        employees[3] = new Employee("Шукшина Оксана Александровна", "Страховой отдел", 35_750);
        employees[4] = new Employee("Фрундзе Алексей Ольгович", "Бухгалтерский отдел", 28_500);
        employees[5] = new Employee("Бибик Жанна Гавриловна", "Юридический отдел", 38_900);
        employees[6] = new Employee("Носов Александр Петрович", "Производственный отдел", 43_500);
        employees[7] = new Employee("Серпухов Антон Федорович", "Экономический отдел", 67_200);
        employees[8] = new Employee("Саяпин Феликс Сергеевич", "Креативный отдел", 50_100);
        employees[9] = new Employee("Пломодьяло Татьяна Анатольевна", "Плановый отдел", 31_700);
    }

    public double getPrintEmployeesList() {
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] == null) continue;
            System.out.println(employees[i]);
        }
        System.out.println();
        return 0;
    }

    public double getPrintSumSalary() {
        double sumSalary = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] == null) continue;
            sumSalary += employees[i].getSalary();
        }
        System.out.printf("Сумма затрат на зраплату в месяц равна: %.2f\n", sumSalary);
        System.out.println();
        return sumSalary;
    }

    public double getPrintMinSalary() {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.printf("Минимальная зарплата равна: %.2f\n", minSalary);
        System.out.println();
        return minSalary;
    }

    public double getPrintMaxSalary() {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.printf("Максимальная зарплата равна: %.2f\n", maxSalary);
        System.out.println();
        return maxSalary;
    }

    public double getPrintMeanSalary() {
        double sumSalary = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] == null) continue;
            sumSalary += employees[i].getSalary();
        }
        double meanSalary = getPrintSumSalary() / employees.length;
        System.out.printf("Среднее значение зарплат ровно: %.2f\n", meanSalary);
        System.out.println();
        return sumSalary;
    }

    public double getPrintPrintPersonList() {
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] == null) continue;
            System.out.printf("Ф.И.О сотрудника: %s", employees[i].getPerson());
            System.out.println();
        }
        return 0;
    }
}
