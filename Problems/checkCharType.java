// Java program to illustrate the
// Character.isDigit() method

import java.util.*;
import java.lang.*;

public class checkCharType {

	public static void main(String[] args)
	{

		// two characters
		char c1 = 'A', c2 = '4';

		// Function to check if the character
		// is digit or not
		System.out.println(
			c1 + " is a digit -> "
			+ Character.isDigit(c1));
		System.out.println(
			c2 + " is a digit -> "
			+ Character.isDigit(c2));
	}
}
