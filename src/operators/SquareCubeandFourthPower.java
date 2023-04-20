package operators;

import java.util.Scanner;

public class SquareCubeandFourthPower {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter a number:");
	
	double number = input .nextDouble();
	double square = Math.pow(number,2);
	double cube = Math.pow(number, 3);
	double fourthPower = Math.pow(number,4);
	System.out.println("Square of "+number+"is"+square);
	System.out.println("cube of "+number+"is"+cube);
	System.out.println("fourth power of"+number+"is"+fourthPower);
	
	
}
}
