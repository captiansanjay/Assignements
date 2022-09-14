package demo;



class Student {
	int rollno;
	String name;
	float fees;

	Student(int rollno, String name, float fees) {
		rollno = rollno;
		name = name;
		fees = fees;
	}

	void setvalue(int rollno, String name, float fees) {
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fees);
	}
} // end of class Student

class Laptop {

	public static void main(String args[]) {

		Student s1 = new Student(111, "ankit", 5000f);

		Student s2 = new Student(112, "sumit", 6000f);

		s2.setvalue(112, "sumit", 6000f);
		
		

		s1.display();

		s2.display();

	}
}

