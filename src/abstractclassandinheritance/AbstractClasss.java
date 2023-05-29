package abstractclassandinheritance;

 public class AbstractClasss {
abstract class AbstractClass{
	public abstract void doSomething();
}
class FinalClass extends AbstractClasss{
	public void doSomething() {
		System.out.println("Doing something");
	}
}
class SubClass extends FinalClass{
	public void doSomething() {
		System.out.println("Doing something else");
	}
	
}


}
