package oops;

public class RemoveTheSpace {
	public static void main(String[] args) {
		String input = "this is java";
		int RemoveTheSpace = input.replace(" ", "").length();
		System.out.println(RemoveTheSpace);
	}
}
