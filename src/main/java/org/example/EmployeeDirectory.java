package org.example;

import java.util.ArrayList;
import java.util.List;

class EmployeeDirectory {
    public List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findEmployeesByExperience(int experienceYears) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getExperienceYears() == experienceYears) {
                result.add(emp);
            }
        }
        return result;
    }

    public List<String> findPhoneNumberByName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) {
                result.add(emp.getPhoneNumber());
            }
        }
        return result;
    }


    public Employee findEmployeeByEmployeeID(int employeeID) {
        for (Employee emp : employees) {
            if (emp.getEmployeeID() == employeeID) {
                return emp;
            }
        }
        return null;
    }

}
