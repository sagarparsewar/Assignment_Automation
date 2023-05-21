package string;

import java.util.Scanner;

public class CapitalizeWords {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Input a Sentence: ");
	        String sentence = scanner.nextLine();

	        String capitalizedSentence = capitalizeFirstLetter(sentence);
	        System.out.println("Capitalized Sentence: " + capitalizedSentence);
	    }

	    private static String capitalizeFirstLetter(String sentence) {
	        StringBuilder result = new StringBuilder();

	        // Split the sentence into individual words
	        String[] words = sentence.split(" ");

	        // Capitalize the first letter of each word
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                char firstChar = Character.toUpperCase(word.charAt(0));
	                String restOfWord = word.substring(1);
	                String capitalizedWord = firstChar + restOfWord;
	                result.append(capitalizedWord).append(" ");
	            }
	        }

	        return result.toString().trim();
	    }
	}