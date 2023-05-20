package string;

import java.util.LinkedHashSet;


public class RemoveDuplicates {
	public static void main(String[] args) {
        String input = "aaabcbabcbabbc";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    private static String removeDuplicates(String input) {
        // Use LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        // Build the resulting string without duplicates
        StringBuilder result = new StringBuilder();
        for (Character c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }
}