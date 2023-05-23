package oops;
///Write Code to print all permutation of input String
//Eg:
//input="123"
//output="123", "132", "213", "231", "312" and "321"

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    public static void main(String[] args) {
        String input = "123";
        Set<String> permutations = generatePermutations(input);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static Set<String> generatePermutations(String input) {
        Set<String> permutations = new HashSet<>();
        if (input == null || input.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char firstChar = input.charAt(0);
        String remainingString = input.substring(1);
        Set<String> words = generatePermutations(remainingString);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String newPermutation = insertCharAt(word, firstChar, i);
                permutations.add(newPermutation);
            }
        }
        return permutations;
    }

    public static String insertCharAt(String word, char c, int position) {
        return word.substring(0, position) + c + word.substring(position);
    }
}