package string;

import java.util.Scanner;

public class Penultimatenexttolastword {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a String :");
		String sentence = scanner.nextLine();
		String penultimatenexttolastword = findPenultimatenexttolastword(sentence);
		scanner.close();
	}

	private static String findPenultimatenexttolastword(String sentence) {
		// TODO Auto-generated method stub
		
		String[] words = sentence.split("\\s+");
		if(words.length<2) {
		return null;
	}
    return words[words.length -2];
}
}