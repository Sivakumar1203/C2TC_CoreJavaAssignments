package com.hitesh.assignment.utilities;

import com.hitesh.assignment.employees.Employee;

/**
 * Utility class for employee operations.
 */
public class EmployeeUtilities {

    public static void displayEmployee(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
}
