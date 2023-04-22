package operators;

import java.util.Random;
import java.util.Scanner;

public class SEVENdaysOfweekday {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//take input from user
		System.out.println("Enter a number:");
		int num = input.nextInt();//Generate a random integer between 1and 7
		Random rand = new Random();
		int RandomNum = rand.nextInt(7)+1;//calculate the day of the week
		int dayofweek = (num+RandomNum)%7;
		String weekday  = "";
		
		switch (dayofweek) {
		case 0:
			weekday = "sunday";
			break;
		case 1 :
			weekday = "Monday";
			break;
		case 2:
			weekday = "Tuesday";
		    break;
		case 3:
		    weekday = "wednesday";
		    break;
		case 4:
			weekday = "Thursday";
			break;
		case 5 :
			weekday = "friday";
			break;
		case 6 :
			weekday = "saturday";
			break;
			}
		//display the name of the weekday
		System.out.println("The weekday is "+ weekday);
		input.close();
	}

}
