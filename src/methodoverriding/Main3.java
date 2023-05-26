package methodoverriding;

public class Main3 {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		animal1.makeSound();       
		animal2.makeSound();
	}

}
class Animal {
	public void makeSound() {
		System.out.println( "animal making a sound ");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dog is barking");
	}
}
class Cat extends Animal {
	public void makeSound() {
		System.out.println("Cat is meowing");
		
	}
}