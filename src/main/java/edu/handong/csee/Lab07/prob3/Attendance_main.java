package edu.handong.csee.Lab07.prob3;
import java.util.Random;
/**
 * This is the main class for Attendance<br>
 * -Generates random number to each absent of the student and prints out their name<br>
 * and their total number of absence if the absence number is bigger than 6<br>
 * @author Kim Myung Jin 21400082
 *
 */
public class Attendance_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGen = new Random(); //random number generator initiation 


		Attendance student1 = new Attendance("Jess", 4,"21400999"); //declare student1 Attendance instance
		Attendance student2 = new Attendance("Kent", 2,"21700111"); //declare student2 Attendance instance
		Attendance student3 = new Attendance("Lucas", 1,"21833222"); //declare student3 Attendance instance
		Attendance student4 = new Attendance("Lucas", 2,"21733444"); //declare student4 Attendance instance


		student1.setAbsent(randomGen.nextInt(10)); //set random number (between 0 to 10) to student1.absent
		student2.setAbsent(randomGen.nextInt(10)); //set random number (between 0 to 10) to student2.absent
		student3.setAbsent(randomGen.nextInt(10)); //set random number (between 0 to 10) to student3.absent
		student4.setAbsent(randomGen.nextInt(10)); //set random number (between 0 to 10) to student4.absent

		if(student1.absent > 6) //runs if statement if student1.absent is bigger than 6
		{
			System.out.println("I'm sorry " + student1.getName() + "You failed this class"); //print out the name of the student1
			System.out.println("Your total number of absence is " + student1.getAbsent()); //print out the total number of absent of student 1
		}
		
		if(student2.absent > 6) //runs if statement if student2.absent is bigger than 6
		{
			System.out.println("I'm sorry " + student2.getName() + "You failed this class"); //print out the name of the student2
			System.out.println("Your total number of absence is " + student2.getAbsent()); //print out the total number of absent of student 2
		}
		
		if(student3.absent > 6) //runs if statement if student3.absent is bigger than 6
		{
			System.out.println("I'm sorry " + student3.getName() + "You failed this class"); //print out the name of the student3
			System.out.println("Your total number of absence is " + student3.getAbsent()); //print out the total number of absent of student 3
		}
		
		if(student4.absent > 6) //runs if statement if student4.absent is bigger than 6
		{
			System.out.println("I'm sorry " + student4.getName() + "You failed this class"); //print out the name of the student4
			System.out.println("Your total number of absence is " + student4.getAbsent()); //print out the total number of absent of student 4
		}



	}

}
