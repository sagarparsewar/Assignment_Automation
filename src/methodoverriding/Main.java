package methodoverriding;

public class Main {
	public static void main(String[] args) {
		Superclass.staticMethod();
		Superclass Subclass;
		Superclass.staticMethod();
		Superclass obj = new Superclass();
		obj.staticMethod();
		Subclass obj2 = new Subclass();
		obj2.staticMethod();
		
	}

}
class Superclass{
	public static void staticMethod() {
		System.out.println("Superclass static method");
	}
}
class Subclass extends Superclass {
	public static void staticMethod() {
		System.out.println("Subclass static method ");
	}
}