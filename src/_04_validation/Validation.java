//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		String hi = "hi";
		String day = "g'day mate";
		
		
		for (int i = 0; i < 11; i++) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(2);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.

		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, hi);
		}
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, day);
		}
			// 2. Repeat all the code above 10 times
}	
	// 3. Find someone to test out your program. They will like it :)
	
	}
}
