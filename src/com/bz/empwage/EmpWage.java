package com.bz.empwage;

public class EmpWage {

	public static void main(String[] args) {
	System.out.println("Welcome to employee wage");
	EmpCheck();
	}
	public static void EmpCheck() {
		// UC-1-Check Employee is present or Absent
		
			//Constants 
			int IS_FULL_TIME=1;
			
			//Computation
			double empCheck= Math.floor(Math.random() * 10 ) % 2;
			
			if(empCheck == IS_FULL_TIME)
				System.out.println("Employee is Present");
			else
				System.out.println("Employee is Absent");
	}
}
