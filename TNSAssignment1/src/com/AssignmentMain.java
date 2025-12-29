package com;

import com.hitesh.assignment.employees.Manager;
import com.hitesh.assignment.employees.Developer;
import com.hitesh.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(101);
        manager.setSalary(80000);
        manager.setDepartment("HR");

        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(102);
        developer.setSalary(60000);
        developer.setProgrammingLanguage("Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployee(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployee(developer);
    }
}
