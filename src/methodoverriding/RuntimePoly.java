package methodoverriding;

public class RuntimePoly {
	public static void main(String[] args) {
		Maruti c1 = new Maruti();
		c1.method2();
		c1.method1();
	}

}
class Car{
	public void method1() {
		System.out.println("Car-method1");
	}
}
class Maruti extends Car{
	public void method1() {
		System.out.println("Maruti-method1");
	}
	
	public void method2() {
		System.out.println("Maruti- method2");
	}
}