package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<EmployeePayroll> employeePayrollDataList = new ArrayList<>();

        EmployeePayrollService employeePayrollImpl = new EmployeePayrollService(employeePayrollDataList);
        Scanner consoleInputReader = new Scanner(System.in);

        employeePayrollImpl.readEmployeePayroll(consoleInputReader);
        employeePayrollImpl.writeEmployeePayroll();
    }
}
