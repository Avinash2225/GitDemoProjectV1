package Day1;

// case 1
/*public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a [] = { 10,20,25,29,14};
		int search_element = 20;
		for ( int i= 0; i<a.length; i++) {
			if( a[i] == search_element) {
				System.out.println("Element Found");
			break;
			}
		}
	
	}*/
// case 2

public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a [] = { 10,20,25,29,14};
		int search_element = 209;
		boolean status = false;
		for ( int i= 0; i<a.length; i++) {
			if( a[i] == search_element) {
				System.out.println("Element Found");
				status = true;
			break;
			}
		}
		if (status== false) {
			System.out.println("Element not found");
		}
	}
}