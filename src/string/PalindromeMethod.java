package string;

import java.util.Scanner;

///Write to a code to check palindrome
//Palindrome: a word, phrase, or sequence that reads the same backwards as forwards

//Eg1:
//input="121"
//output=true

//Eg2: input="123"
//output=false 




public class PalindromeMethod {

	public static boolean isPalindrome(String input) {
        // Remove any whitespace and convert to lowerCase
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Compare the input string with its reversed version
        StringBuilder reversed = new StringBuilder(input).reverse();
        return input.equals(reversed.toString());
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter astring:");
        String input = scanner.nextLine();
        scanner.close();
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is palindrome?"+isPalindrome);

        String input2 = "123";
        System.out.println(isPalindrome(input2));
    }
}
