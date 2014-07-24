package engine.model;

import java.sql.Date;


public class User {
	
	String id;
	String name;
	String username;
	String email;
	String password;
	Date d_o_b; 
	int age;
	String address;
	boolean gender; // true=male
	String major;
	String university;
	Date graduation_year;
	String biography;
	
	public User (String name,String username, String email, String password, Date d_o_b,int age,
			     String address, boolean gender, String major, String university, Date graduation_year,
			     String biography){
		//id++;
		this.name=name;
		this.username=username;
		this.email=email;
		this.password=password;
		this.d_o_b=d_o_b; 
		this.age=age;
		this.address=address;
		this.gender=gender; // true=male
		this.major=major;
		this.university=university;
		this.graduation_year=graduation_year;
		this.biography=biography;
		
	}
	public User (String name,String username, String email, String password){
	//id++;
	this.name=name;
	this.username=username;
	this.email=email;
	this.password=password;

}
	public User (){
	//id++;
	this.name=null;
	this.username=null;
	this.email=null;
	this.password=null;

}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getD_o_b() {
		return d_o_b;
	}

	public void setD_o_b(Date d_o_b) {
		this.d_o_b = d_o_b;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Date getGraduation_year() {
		return graduation_year;
	}

	public void setGraduation_year(Date graduation_year) {
		this.graduation_year = graduation_year;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	public void contact(){
		
	}
	
}
