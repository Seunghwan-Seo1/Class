package hw;

public class HW02 {

	
	
	static class Person {
		
		String name;
		
		public String getName() {
			return name;
		}
	}
	
	static class Student extends Person {
		private int id;
		
		public Student(int id) {
			super();
			this.id = id;
			
		}
		public int getID() {
			return id;
		}
		
	}
	
	public static void main(String[] args) {
		Student student = new Student(123);
		System.out.println(student.getID());
	}
}