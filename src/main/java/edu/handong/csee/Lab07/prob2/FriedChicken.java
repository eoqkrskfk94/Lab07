package edu.handong.csee.Lab07.prob2;
/**
 * This is the main class for chicken<br>
 * - Prints out the information of the kinds of chickens (names and stars)
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class FriedChicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chicken menu1 = new Chicken("Cheese mustard", 16000.00, 3); //declare menu1 chicken instance
		Chicken menu2 = new Chicken("Honey mustard", 16000.00, 4); //declare menu1 chicken instance
		Chicken menu3 = new Chicken("Spicy chicken", 16000.00, 1); //declare menu1 chicken instance

		
		
		
		System.out.println(menu1.getName() + "'s rating is " + menu1.getStars()); //print out info of menu1 name and star
		System.out.println(menu2.getName() + "'s rating is " + menu2.getStars()); //print out info of menu1 name and star
		System.out.println(menu3.getName() + "'s rating is " + menu3.getStars()); //print out info of menu1 name and star
	}

}
