package ArrayQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int Num [] = {1,2,3,4,5,6,7,8,9,10,12};
		// Array does not conatin duplicate
		// array no need to be sorted order
		// these value in some range
	//	logic 1+2+3+5+6= 17  1+2+3+4+5+6=21 21-17 = 4  
		int sum1 =0;
		int mn = 0;
		for(int i=0; i<Num.length; i++) {
			
			sum1 = sum1 + Num[i];      // 17
		}
		System.out.println(sum1);
		
		for(int i=1; i<=12; i++) {
			mn = mn + i;
			
		}
		System.out.println("Sum of the mn is:"+ mn);
		
		System.out.println("missing number in the array is:" + ( mn -sum1));
		
		
		
		
		
		
		
	}

}
