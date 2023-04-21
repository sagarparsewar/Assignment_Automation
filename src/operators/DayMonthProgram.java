package operators;

import java.util.Scanner;

public class DayMonthProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the month number (1-12):");
		int month = sc.nextInt();
		sc.close();
		int days;
		switch (month) {
		case 1 :// january
		case 3://march
		case 5 ://may
		case 7 : //july
		case 8 : //august
		case 10: //october
		case 12 ://december
			days = 31;
			break;
		case 4 ://april 
		case 6 ://june
		case 9 ://september
		case 11 ://november 
			days = 30;
			break;
			default :
				System.out.println("Invalid month number !");
				return;
			}
		System.out.println("Number of day in month "+month+":"+days);
	}

}
