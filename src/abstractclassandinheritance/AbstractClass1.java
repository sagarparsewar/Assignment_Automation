package abstractclassandinheritance;

abstract class AbstractClass1 {
	
	abstract class AbstractClass {
	    public abstract void doSomething();
	}

	class ConcreteClass extends AbstractClass {
	    public void doSomething() {
	        System.out.println("Doing something.");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // AbstractClass abstractObj = new AbstractClass(); // This will cause a compilation error
	        
	        AbstractClass concreteObj = new ConcreteClass();
	        concreteObj.doSomething(); // Outputs "Doing something."
	    }
	}
}