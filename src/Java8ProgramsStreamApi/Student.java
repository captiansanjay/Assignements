package Java8ProgramsStreamApi;

import java.time.LocalDateTime;

public class Student {

	int rollno;
	String date_of_addmission, dob;
	String maths, physics, chemistry, English, hindi; // marks in subjectsString classname;

	public Student(int rollno, String date_of_addmission, String dob, String maths, String physics,
			String chemistry, String english, String hindi) {
	
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
	}

}
