package edu.handong.csee.Lab07.prob1; //package name
/**
 * This class has the follwing methods & constructors:<br>
 * YeartoCentury() constructor<br>
 * YeartoCentury(int year) constructor<br>
 * Centurycal(int year)<br>
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class YeartoCentury {
	
	int year; //declare int year
	
	public YeartoCentury() //declaration of YeartoCentury constructor
	{
		year = 0; //declare year value to 0
	}
	
	public YeartoCentury(int year) //declaration of YeartoCentury constructor
	{
		this.year = year; //put the inserted value into year
	}
	
	public int Centurycal(int year) //declaration of Centurycal method
	{
		if(year % 100 == 0) //runs if statement if the remaining of year/100 is 0
		{
			year = year/100; //divide year by 100
		}
		else //runs the else statement if if statement does not run
		{
			year = (year / 100) + 1; //divide year by 100 and add 1
		}
		return year; //returns the value of year
	}
}
