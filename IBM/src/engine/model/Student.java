package engine.model;

import java.sql.Date;

public class Student extends User {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String username, String email, String password,
			Date d_o_b, int age, String address, boolean gender, String major,
			String university, Date graduation_year, String biography) {
		super(name, username, email, password, d_o_b, age, address, gender, major,
				university, graduation_year, biography);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String username, String email, String password) {
		super(name, username, email, password);
		// TODO Auto-generated constructor stub
	}
	

}
