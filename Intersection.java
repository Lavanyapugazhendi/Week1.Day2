package week1.day2;


public class Intersection {

	public static void main(String[] args) {
		int[] array1 = {6,3,9,7,5,8};
		int[] array2 = {0,1,2,3,4,5};
		System.out.println("The Intersection of two arrays are  : ");
		for (int i = 0; i < array2.length; i++) {
		    for (int j = 0; j < array2.length; j++) {	
			if (array1[i] == array2[j]) {
				System.out.println("array1 : " + array1[i]);
				System.out.println("array2 : " + array2[j]);
	
				
			}
			
		}
			 
			
		}
		

	}

}
