package com.workintech.developers;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(int id,String name, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public long getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee starts to working");
    }
}
