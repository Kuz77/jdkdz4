package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();


        Employee emp1 = new Employee(1, "123456789", "Иванов", 5);
        Employee emp2 = new Employee(2, "987654321", "Петров", 3);

        directory.addEmployee(emp1);
        directory.addEmployee(emp2);


        List<Employee> employeesWithExperience = directory.findEmployeesByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет:");
        for (Employee emp : employeesWithExperience) {
            System.out.println(emp);
        }

        List<String> phoneNumbers = directory.findPhoneNumberByName("Иванов");
        System.out.println("Номер телефона Иванова: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        Employee employee = directory.findEmployeeByEmployeeID(2);
        System.out.println("Сотрудник с табельным номером 2:");
        System.out.println(employee);
    }
}