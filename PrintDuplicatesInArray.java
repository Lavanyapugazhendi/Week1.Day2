package week1.day2;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
		int arrNum []  = {1,3,5,2,9,2,5};
		
		for (int i = 0; i < arrNum.length ; i++) {
			for (int j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i]==arrNum[j]) {
					System.out.println("Found Duplicate in array is " + arrNum[i] );
					
				}
			}
		}
	}

}
