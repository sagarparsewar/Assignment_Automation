package operators;

import java.util.Scanner;

public class DaysinMonthIfElseCondition {
	public static void main(String[] args) {
		//create scanner object to get input from user
		Scanner input = new Scanner(System.in);
		//prompt user to enter month number
		System.out.println("enter month number (1-12):");
		int month = input.nextInt();
		// determine the number of days in the month using if -else condition 
		int dayInmonth;
		int days = 0;
		if (month ==2) {
			dayInmonth= 28;
		}
		else if (month ==4||month==6||month==9||month==11) {
			days = 30;
		}
		else {
			days = 31;
		}
		System.out.println("The number of days in month " + month+ "is" +days);



	}



}
