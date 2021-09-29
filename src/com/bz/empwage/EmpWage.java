package com.bz.empwage;

public class EmpWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	 	private final String company;
	    private final int empRatePerHour;
	    private final int maxHoursPerMonth;
	    private int totalEmpWage;
		private int numOfWorkingDays;


	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		
		EmpWage Dmart = new EmpWage("Dmart", 20, 2, 10);
        EmpWage Relience = new EmpWage("Relience", 10, 4, 20);
        EmpWage JIO = new EmpWage("JIO", 15, 6, 80);
        Dmart.computeEmpWage();
        System.out.println(Dmart);
        Relience.computeEmpWage();
        System.out.println(Relience);
        JIO.computeEmpWage();
        System.out.println(JIO);
	}
	 public EmpWage (String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
	        this.company = company;
	        this.empRatePerHour = empRatePerHr;
	        this.numOfWorkingDays = numOfWorkingDays;
	        this.maxHoursPerMonth = maxHoursPerMonth;
	 }

	public void computeEmpWage() {
		// variables
		int empHour = 0, totalEmpHour = 0, totalWorkingDays = 0;
		
		// computation
		while (totalEmpHour <= maxHoursPerMonth && totalWorkingDays <= numOfWorkingDays) {
			totalWorkingDays++;

			int empCheck = (int) Math.random() * 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHour = 4;
				break;
			case IS_FULL_TIME:
				empHour = 8;
				break;
			default:
				empHour = 0;
			}
			totalEmpHour += empHour;
			System.out.println("Day" + totalWorkingDays + "Emp Hour " + empHour);
		}
		int totalEmpWage = totalEmpHour * empRatePerHour;
		System.out.println("Total Employee wage for company " + company + " is " + totalEmpWage);
		return;
	}

}
