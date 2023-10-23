package Employees;

import java.lang.Comparable;

public class Employee {
    private String code;
    private String name;
    private int salary;
    public Employee(String code, String name, int salary) {
        System.out.println("1-Add new employee");
        System.out.println("2-Remove an employee");
        System.out.println("3-Promoting the employee's salary");
        System.out.println("4-Print the list");
        System.out.println("5-Save to file");
        System.out.println("6-Quit");
        System.out.println();
        System.out.println("Select 1 => 6: ");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int compareTo(Object emp) {
        return this.getCode().compareTo(((Employee)emp).getCode());
    }
}
