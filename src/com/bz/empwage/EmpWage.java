package com.bz.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		UsingSwitchCase();
	}

	public static void UsingSwitchCase() {
		// UC-4-Solve employee wage using case statement

		// Constants
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;

		// Variables
		int empHrs = 0;
		int empWage = 0;

		// Computation
		int empCheck = (int) (Math.random() * 100) % 3;

		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			System.out.println("Employee is present full time");
			break;

		case IS_PART_TIME:
			empHrs = 4;
			System.out.println("Employee is present part time");
			break;

		default:
			empHrs = 0;
			System.out.println("Employee is absent");
			break;

		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is :" + empWage);

	}
}
