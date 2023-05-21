package string;

public class RepetitiveCharacter {
	public static void main(String[] args) {
		String input = "aabbbcaabbc";
		StringBuilder result = new StringBuilder();
		char currentChar ='\0';
		int count =0;
		for(int i= 0;i<input.length();i++) {
			char c = input.charAt(i);
			
			if (c == currentChar) {
				count++;
			}
			else {
				if (currentChar !='\0') {
					result.append(currentChar);
					if (count>1) {
						result.append(count);
				}
			}
				currentChar = c;
				count =1;
			
			}
		}
		if (currentChar!='\0') {
			result.append(currentChar);
			if (count>1) {
				result.append(count);
			}
		}
		String output= result.toString();
		System.out.println(output);
	}

}
