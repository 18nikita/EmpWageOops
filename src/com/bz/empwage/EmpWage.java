package com.bz.empwage;

public class EmpWage {

	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		EmpWageForMultipleCompany("Dmart", 20, 2, 10 );
		EmpWageForMultipleCompany("Relience", 10, 4, 20 );
	}
	
	public static int EmpWageForMultipleCompany(String company, int empRatePerHour, int NoOfWorkDay, int MaxHourPerMonth ) {
		
		//variables
		int empHour=0, totalEmpHour=0, totalWorkingDays=0;
		//computation
		while(totalEmpHour<=MaxHourPerMonth && totalWorkingDays<=NoOfWorkDay) {
			totalWorkingDays++;
			
			int empCheck=(int) Math.random()*3;
			switch(empCheck) {
			case IS_PART_TIME:
				empHour=4;
				break;
			case IS_FULL_TIME:
				empHour=8;
				break;	
			default:
				empHour=0;
			}
			totalEmpHour += empHour;
			System.out.println("Day"+totalWorkingDays+ "Emp Hour "+empHour);
		}
		int totalEmpWage=totalEmpHour*empRatePerHour;
		System.out.println("Total Employee wage for company "+ company+" is "+totalEmpWage);
		return totalEmpWage;
	}

}
