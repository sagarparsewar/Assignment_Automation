package inheritance;

public class Main {
public static void main(String[] args) {
	Child childObj = new Child();
	childObj.test();
	
	Parent parentObj = new Parent();
	parentObj.test();
}
}

// create class parent
class Parent {
	public void test() {
		System.out.println("This is the test method in the Parent class");
	}
}
//create "test" method in parent class

//create class child and extend parent
class Child extends Parent{
	
}
// create an object of child class and use the test method in the main class
