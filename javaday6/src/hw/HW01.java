package hw;

public class HW01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
	}
}

class Animal {
	String name;
	
	String getName() {
		return this.name;
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("바우와우");
	}
}