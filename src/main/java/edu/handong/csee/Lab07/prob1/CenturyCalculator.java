package edu.handong.csee.Lab07.prob1; //package name

import java.util.Scanner; //imports scanner class
/**
 * This is the main class for century calculator
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class CenturyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //creates scanner for insertion
		YeartoCentury YtC = new YeartoCentury(); //calls out the class YeartoCentury in order to use the methods in that class
		
		int year = 0; //declares int year with the value of 0
		
		System.out.println("Input year:"); //prints out the string
		year = input.nextInt(); //inserts entered value to the variable
		
		System.out.println(year + " is " + YtC.Centurycal(year) + "th century."); //prints out the calculated century
		
		

	}
	

}
