package operators;

public class CreatenNonParamerizedMethod {
	// Non- parameterized method
public void sayhello() {
	System.out.println("Hello");
	
}
// static method
public static void saygoodbye() {
	System.out.println("goodbye");
}
// main method 
public static void main(String[] args) {
	CreatenNonParamerizedMethod ex =new CreatenNonParamerizedMethod();
	ex.sayhello();
	saygoodbye();
		
}
}
