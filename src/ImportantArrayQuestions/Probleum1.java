package ImportantArrayQuestions;

import java.util.Arrays;

public class Probleum1 {

	public static void main(String[] args) {

		int num1 [] = new int [4];
		num1[0] = 11;
		num1[1] = 31;
		num1[2] = 41;
		num1[3] = 51;
		
		int num2 [] = new int [4];
		
		num1[0] = 11;
		num1[1] = 31;
		num1[2] = 41;
		num1[3] = 51;
		
		boolean b2 = (Arrays.equals(num1, num2));
		System.out.println(b2);
	
	}

}
