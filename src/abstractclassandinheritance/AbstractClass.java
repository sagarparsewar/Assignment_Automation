package abstractclassandinheritance;
//Can abstract class have constructors in Java
public abstract class AbstractClass {
	private int value;
	public AbstractClass(int value) {
		this.value = value;
		}
 public abstract void someMethod();
}





abstract class ConcreteClass extends AbstractClass{

	public ConcreteClass(int value) {
		super(value);
		// TODO Auto-generated constructor stub
	}
	public void someMethod() {
		System.out.println("Implementation of someMethod in concreteClass");
	}
}