package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService{console_IO,FILE_IO,DB_IO,REST_IO};
    private static List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {

    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList){ }

    public static void main(String[] args){
        ArrayList<EmployeePayrollData> employeePayrollData=new ArrayList<>();
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
        
    }



    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println(" Enter Empoyee Id :");
        int empId=consoleInputReader.nextInt();

        System.out.println(" Enter Employee Name :");
        String name= consoleInputReader.next();
        System.out.println(" Enter the Employe Salary :");
        double salary= consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(empId,name,salary));

    }
    private void writeEmployeePayrollData() {

        System.out.println(" Writing Employee Payroll Roaster to console \n" +employeePayrollList);

    }

}