package com.training.Enumerationcustom;

enum Day {
	MONDAY, FRIDAY;

	Day() {
		System.out.println("Entering constructor block");
	}

	/*
	 * public static void main(String args[]) { Day day = Day.MONDAY;
	 * 
	 * System.out.println(day.values()); }
	 */
}

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day testday = Day.MONDAY;
	}

}
