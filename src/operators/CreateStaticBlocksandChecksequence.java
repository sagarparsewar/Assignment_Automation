package operators;

public class CreateStaticBlocksandChecksequence {
    static {
    	System.out.println("first block");
    }
    static {
    	System.out.println("second block");
    	
    }
    public static void main(String[] args) {
		System.out.println("main method");
	}
}
