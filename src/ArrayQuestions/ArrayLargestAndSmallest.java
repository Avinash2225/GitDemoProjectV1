package ArrayQuestions;

import java.util.Arrays;

public class ArrayLargestAndSmallest {

	public static void main(String[] args) {

		int Arr [] = {10 , -10,3447,4533,-374643};
		
		int largest = Arr[0];
		
		int smallest = Arr[0];
		
		 for(int i =0; i<=Arr.length-1; i++) {
			 if(Arr[i]> largest) {
				 largest= Arr[i];
				 
			 }
			 else if   (Arr[i]<smallest)           {
				 smallest = Arr[i];
			 }
		 }
		 // make sure your code is working fine for all conditions 
		 System.out.println("\n given array is:" + Arrays.toString(Arr));
		 System.out.println("largest number is: "+ largest);
		 System.out.println("smallest number is: "+ smallest);
		
		
		
		
		
		
		
		
		
		
	}

}
