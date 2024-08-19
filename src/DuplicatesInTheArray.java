
public class DuplicatesInTheArray {

	public static void main(String[] args) {

		int a [] = {1,2,3,4,2,4,3,6,8,8,2};
	//	int dub=0;
	boolean flag = false;
	for(int i=0; i<a.length; i++) {
	
	
	for(int j=i+1; j<a.length; j++) {
		if(a[i]==a[j]) {
			flag = true;
			System.out.println("found dublicates element:" + a[i]);

		}

	}
	}	
	
		if(flag==false) {
			System.out.println("Dublicate element is not found");
		}
	
	}

}
