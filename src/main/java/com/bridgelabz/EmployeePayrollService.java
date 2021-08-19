package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    private List<EmployeePayroll> employeePayrollList;


    public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    /**
     * Read Method for Employee Payroll
     */
    void readEmployeePayroll(Scanner inputRead) {
        System.out.print("Enter EmployeeId : ");
        int id = inputRead.nextInt();
        System.out.print("Enter Employee Name : ");
        String name = inputRead.next();
        System.out.print("Enter Employee Salary : ");
        int salary = inputRead.nextInt();
        employeePayrollList.add(new EmployeePayroll(id, name, salary));
    }

    /**
     * Write Method for Employee Payroll
     */
    void writeEmployeePayroll() {
        System.out.println("\nEmployee Payroll:\n" + employeePayrollList);
    }

}
