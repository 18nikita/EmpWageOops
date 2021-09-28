package com.bz.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		WageForMonth();
	}
	
	public static void WageForMonth() {
		// UC-5-Emp wage for month
		
		// Constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int WORKING_DAYS_IN_MONTH = 20;

		// Variables
		int empHrs = 0;
		int empWage = 0;

		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;

		if (empCheck == IS_PART_TIME) {
			empHrs = 4;
			System.out.println("Employee is PartTime");
		}

		else if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			System.out.println("Employee is FullTime");
		} else {
			System.out.println("Employee is Absent");
		}

		// Formula
		empWage = empHrs * EMP_RATE_PER_HOUR * WORKING_DAYS_IN_MONTH;
		System.out.println("Employee Wage is: " + empWage);
	}
}
