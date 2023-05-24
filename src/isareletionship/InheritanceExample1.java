package isareletionship;

public class InheritanceExample1 {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentmethod();
		
		Child child = new Child();
		child.parentmethod();
		child.childMethod();
	}

}

class Parent{
	public void parentmethod() {
		System.out.println("This is a method in the Parent class");
	}
}
class Child extends Parent{
	public void childMethod() {
		System.out.println("This is a method in the Child class");
	}
}