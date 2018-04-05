package edu.handong.csee.Lab07.prob2;
/**
 * This class has the follwing methods & constructors:<br>
 * Chicken() constructor<br>
 * Chicken(String name, double price, int stars) constructor<br>
 * Getters and setters for each variables<br>
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class Chicken {
	
	String name; //declare string name
	double price; // declare double price
	int stars; // declare int stars
	
	public String getName() { //returns the value of name
		return name; //return name
	}

	public void setName(String name) { //sets the value of name
		this.name = name; // inserts the value to name
	}

	public double getPrice() { //returns the value of price
		return price; //return price
	}

	public void setPrice(double price) { //sets the value of price
		this.price = price; //inserts the value of price
	}

	public int getStars() { //returns the value of name
		return stars; //return stars
	}

	public void setStars(int stars) { //sets the value of stars
		this.stars = stars; // inserts the value of stars
	}
	
	public Chicken() //declaration of chicken constructor
	{
		name = ""; //
		price = 0;
		stars = 0;
	}
	
	public Chicken(String name, double price, int stars) //declaration of chicken constructor
	{
		this.name = name; //inserts the inserted value to name
		this.price = price; //inserts the inserted value to price
		this.stars = stars; //inserts the inserted value to stars
	}
	
	

}
