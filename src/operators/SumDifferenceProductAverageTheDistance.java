package operators;

import java.util.Scanner;

public class SumDifferenceProductAverageTheDistance {
	
//methods
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the first number :");
		double num1 = input .nextDouble();
		System.out.println("Enter the second number:");
		double num2 = input.nextDouble();

// input the objects
		double sum = num1+num2;
		double difference = num1-num2;
		double product = num1*num2;
		double average=(num1+num2)/2;
		double distance = Math.abs(num1-num2);
		double maximum = Math.max(num1, num2);
		double minimum = Math.min(num1,num2);
// output command
		System.out.println("Sum:"+sum);
		System.out.println("Difference:"+difference);
		System.out.println("Product:"+product);
		System.out.println("Average:"+average);
		System.out.println("Distance:"+distance);
		System.out.println("Maximum:"+maximum);
		System.out.println("Minimum:"+minimum);






	}

}
