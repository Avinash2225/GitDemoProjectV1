package ArrayQuestions;

public class SearchingElementInArray1 {

	public static void main(String[] args) {

		int num [] = {1,2,3,4,5,6}; // elements can be any order
		int a = 48;
		boolean b = false;
		for(int i=0; i<num.length-1; i++) {
			System.out.println(num[i]);
			if(a==num[i]) {
				System.out.println("element is found:" + i);
				b= true;
				break;
			}
		
		if(b=false) {
		System.out.println("Element is not found");
		}
		
		
	}

}
}