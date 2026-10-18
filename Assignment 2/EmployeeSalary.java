package com.java.assignments;
import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		EmployeeSalary obj = new EmployeeSalary();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name:- ");
		String emp = sc.nextLine();
		
		System.out.println("Enter your Basic salary:- ");
		double basic = sc.nextDouble();
		
		System.out.println("Enter your Allowance:- ");
		double allowance = sc.nextDouble();
		
		System.out.println("Enter your Deductions:- ");
		double gross = sc.nextDouble();
		
		double salary = obj.calculateSalary(basic,allowance);
		
		double net = obj.calculateSalary(basic,gross);
		
		obj.displayDetails(emp, salary, net);
		
		sc.close();

	}
	
	double calculateSalary(double basic , double allowance) {
		return basic+allowance;
	}
	
	double calculateNetSalary(double basic , double gross) {
		return basic-gross;
	}
	
	void displayDetails(String emp , double gross , double net) {
		System.out.println("Employee Name : " + emp);
		System.out.println("Gross Salary : " + gross);
		System.out.println("Net Salary : " + net);
	}

}
