package hw;

public class HW05 {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		cat.parentSound();
	}
	
	static class Animal {
	    public void sound() {
	        System.out.println("mmmm");
	    }
	}
	
	
	
	static class Cat extends Animal {
		
	    @Override
	    public void sound() {
	        System.out.println("Meow");
	    }

	    public void parentSound() {
	        super.sound();
	    }
	}
}
