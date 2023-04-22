package operators;

public class DivisibleBy3And5 {
	public static void main(String[] args) {
		for (int num = 1;num <=100;num++) {
			if(num%3 ==0&&num%5==0) {
				System.out.println(num +"is divisible by both 3 and 5");
			}
			else if (num % 3 ==0) {
				System.out.println(num + "is divisible by 3");
			}
			else if (num % 5 ==0) {
				System.out.println(num +"is divisible by 5");
			}
		}
	}

}
