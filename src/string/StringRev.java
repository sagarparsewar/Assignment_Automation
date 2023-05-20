package string;

public class StringRev {
	public static void main(String[] args) {
		String input = "test";
		String reversed = StringRev(input);
		System.out.println(reversed);
	}

	private static String StringRev(String input) {
		// TODO Auto-generated method stub
		StringBuilder reversed = new StringBuilder();
		for(int i = input.length()-1;i>=0;i--) {
			reversed.append(input.charAt(i));
			}
		return reversed.toString();
	}

}
