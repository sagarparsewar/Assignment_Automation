package operators;
//Create any void method
//create 2 methods one should be static and one non static method
public class Test1 {
// non -static method
	public void nonStaticMethod() {
		System.out.println("Non-static Mehtod");
		
	}
	//static method
	public static void staticMethod() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		 Test1.staticMethod();
		
	}
}
