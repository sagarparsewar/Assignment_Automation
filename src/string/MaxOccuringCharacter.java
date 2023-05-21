package string;

public class MaxOccuringCharacter {
	public static void main(String[] args) {
		String input = "abcabcabcaabc";
		char[] characters = input.toCharArray();
		int[]characterCounts = new int[256];//Assuming ASCII characters
		//Count occurrences of each character
		for(char c: characters) {
			characterCounts[c]++;
		}
		char maxCharacter = '\0';
		int maxCount = -1;
		//find the character with maximum occurrence
		for (int i =0;i< characterCounts.length;i++) {
			if (characterCounts[i]>maxCount) {
				maxCount =characterCounts[i];
				maxCharacter =(char)i;
			}
		}
	
	System.out.println("Maximum char found:" + maxCharacter+ "with" +maxCount + "occurrances.");
	}
	

}
