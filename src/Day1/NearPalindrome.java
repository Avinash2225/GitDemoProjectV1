package Day1;

public class NearPalindrome {

	public static void main(String[] args) {
	
		int	num	  = 444;
		int rev=0;
		int org_num = num;
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num = num/10;
			
			// this is the main method
		}
		if(org_num==rev) {
			System.out.println("number is palindrome");
			
		}else {
			System.out.println ("number is not a palindome");
		
	}

}
}