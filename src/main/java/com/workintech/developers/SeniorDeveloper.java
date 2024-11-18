package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("Mid Developer " + getName() + " is implementing features!");
        setSalary(getSalary() * 1.10); // 10% increase when working
    }
}
