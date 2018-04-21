
/*
	ISYS 320
	Name(s): Rona Davis
	Date: April 21, 2018
*/

import java.util.Random;
import java.util.Scanner;


public class P5RandomMessageRepeater {
	public static void main(String[] args) {
		// System.out.println(getRandomMessage());

//		doWhileRepeater(getRandomMessage());

		String randomString = getRandomMessage();
		doWhileRepeater(randomString);
		System.out.println("out of loop");

	}
	public static String getRandomMessage() {
		String[] messages = new String[3];
		messages[0] = "I need help!!! ";
		messages[1] = "Programming takes too long?!";
		messages[2] = "Collaboration is best!";

		Random rand = new Random();
		int randomNumber = rand.nextInt(3);

		return messages[randomNumber];
	}

	public static void doWhileRepeater(String message) {

		Scanner sc = new Scanner(System.in);
		int userInput = 1;
		
		System.out.println(message);
		System.out.println("Enter any positive number to continue or a negative number to exit!!");
		do {
			userInput = sc.nextInt();
			System.out.println(message);
		} while (userInput >= 0);
	}
}
