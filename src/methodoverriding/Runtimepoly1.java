package methodoverriding;

public class Runtimepoly1 {
	public static void main(String[] args) {
		Car c1 = new Maruti();
		c1.method1();
		Car c2 = new Maruti();
		c2.method1();
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
}