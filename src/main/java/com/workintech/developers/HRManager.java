// HRManager.java
package com.workintech.developers;

import java.util.ArrayList;
import java.util.List;

public class HRManager extends Employee {
    private List<JuniorDeveloper> juniorDevelopers;
    private List<MidDeveloper> midDevelopers;
    private List<SeniorDeveloper> seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new ArrayList<>();
        midDevelopers = new ArrayList<>();
        seniorDevelopers = new ArrayList<>();
    }

    @Override
    public void work() {
        System.out.println("HR Manager " + getName() + " is managing the development team!");
        setSalary(getSalary() * 1.12); // 12% increase when working
    }

    // Overloaded addEmployee methods for different developer types
    public void addEmployee(JuniorDeveloper developer) {
        if (developer != null) {
            juniorDevelopers.add(developer);
            System.out.println("Junior Developer " + developer.getName() + " added successfully.");
        } else {
            System.out.println("Error: Cannot add null Junior Developer!");
        }
    }

    public void addEmployee(MidDeveloper developer) {
        if (developer != null) {
            midDevelopers.add(developer);
            System.out.println("Mid Developer " + developer.getName() + " added successfully.");
        } else {
            System.out.println("Error: Cannot add null Mid Developer!");
        }
    }

    public void addEmployee(SeniorDeveloper developer) {
        if (developer != null) {
            seniorDevelopers.add(developer);
            System.out.println("Senior Developer " + developer.getName() + " added successfully.");
        } else {
            System.out.println("Error: Cannot add null Senior Developer!");
        }
    }

    // Optional: Methods to get team sizes
    public int getJuniorCount() {
        return juniorDevelopers.size();
    }

    public int getMidCount() {
        return midDevelopers.size();
    }

    public int getSeniorCount() {
        return seniorDevelopers.size();
    }

    // Optional: Methods to get all developers of each type
    public List<JuniorDeveloper> getJuniorDevelopers() {
        return new ArrayList<>(juniorDevelopers); // Return a copy to prevent external modification
    }

    public List<MidDeveloper> getMidDevelopers() {
        return new ArrayList<>(midDevelopers);
    }

    public List<SeniorDeveloper> getSeniorDevelopers() {
        return new ArrayList<>(seniorDevelopers);
    }
}