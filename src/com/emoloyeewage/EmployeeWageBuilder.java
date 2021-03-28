package com.emoloyeewage;

import java.util.Random;

public class EmployeeWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage problem");

		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HRS = 20;
		int salary , empHrs;
		Random rand = new Random();
		int empCheck = rand.nextInt(3);
		switch(empCheck) {
			case 1:
				empHrs = 8;
				System.out.println("Employee is Present");
				break;
			case 2:
				empHrs = 4;
				System.out.println("Employee is part time");

				break;
			default:
				empHrs= 0;
				System.out.println("Employee is Absent");
				break;
		}
		salary=(empHrs * EMP_RATE_PER_HRS );
		System.out.println("salary:"+salary);
	}
}
