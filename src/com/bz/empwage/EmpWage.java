package com.bz.empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		EmployeeWage();
	}

	// Constatnts
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_RATE_PER_HOUR = 20;
	static final int WORKING_DAYS_IN_MONTH = 20;
	static final int MAX_HOURS_IN_MONTH = 100;

	public static void EmployeeWage() {

		// Loacl Variables
		int empHrs = 0;
		int totalWorkday = 0;
		int totalEmpHrs = 0;

		while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkday < WORKING_DAYS_IN_MONTH) {
			totalWorkday++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("empCheck : " + empCheck);
			System.out.println("WorkDay : " + totalWorkday);
			switch (empCheck) {
			case IS_FULL_TIME:
				System.out.println("Employee is Full Time present");
				empHrs = 8;
				break;
			case IS_PART_TIME:
				System.out.println("Employee is Part Time Present");
				empHrs = 4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("totalWorkday" + " Emp Hrs :" + totalEmpHrs);
		}
		int totalEmpWage = EMP_RATE_PER_HOUR * totalEmpHrs;
		System.out.println("total Emp Wage: " + totalEmpWage);
	}
}