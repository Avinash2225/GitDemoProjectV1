package ArrayQuestions;

public class EvenOdddNumberInArray {

	public static void main(String[] args) {

		int num [] = {1,2,3,4,5,6,7,8};
		System.out.println("Even Numbers in the Array");

		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);

			}
		}
		System.out.println("Odd Numbers in the Array");
			for(int i=0; i<num.length; i++) {
				if(num[i]%2!=0) {
					System.out.println(num[i]);

				}
			
		
		
		
			}
		
		
		
		
	}

}
