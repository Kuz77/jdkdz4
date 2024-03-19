package org.example;

class Employee {
    private int employeeID;
    private String phoneNumber;
    private String name;
    private int experienceYears;

    public Employee(int employeeID, String phoneNumber, String name, int experienceYears) {
        this.employeeID = employeeID;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
