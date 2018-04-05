package edu.handong.csee.Lab07.prob3;
/**
 * This class has the follwing methods & constructors:<br>
 * Attendance() constructor<br>
 * Attendance(String name, int year, String id) constructor<br>
 * Getters and setters for each variables<br>
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class Attendance {
	
	String name; //declares string name
	int year; // declares int year
	String id; //declares string id
	int absent; //declares int absent
	

	public String getName() { //get method returns the value of name
		return name; //returns name
	}

	public void setName(String name) { //set method that sets the value of name
		this.name = name; //inserts the value to name
	}

	public int getYear() { //get method that returns the value of year
		return year; //returns year
	}

	public void setYear(int year) { //set method that sets the value of year
		this.year = year; //inserts the value to name
	}

	public String getId() { //get method that returns the value of id
		return id; //returns id
	}

	public void setId(String id) { //set method that sets the value of id
		this.id = id; //inserts the value to name
	}

	public int getAbsent() { //get method that returns the value of year
		return absent; //returns absent
	}

	public void setAbsent(int absent) { //set method that sets the value of absent
		this.absent = absent; //inserts the value to name
	}

	public Attendance() //declaration of YeartoCentury constructor
	{
		name = ""; //inserts blank to name
		year = 0; // inserts 0 to year
		id = ""; // inserts blank to id
		absent = 0; //inserts 0 to absent
	}
	
	public Attendance(String name, int year, String id) //declaration of YeartoCentury constructor
	{
		this.name = name; //inserts the inserted value to name
		this.year = year; //inserts the inserted value to year
		this.id = id; //inserts the inserted value to id
	}

	
}
