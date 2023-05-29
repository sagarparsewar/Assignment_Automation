package abstractclassandinheritance;

public abstract class Animal {

	public abstract void makeSound();

	public void sleep(){
		System.out.println("Zzz");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("woof");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Meow!");
	}
}