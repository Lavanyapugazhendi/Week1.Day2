package week1.day2;

import java.util.Arrays;

public class MissingElementInAnarray {

	public static void main(String[] args) {
		int[] arrNum = {0,1, 2, 3, 5,7,6};
		// sort the array
		Arrays.sort(arrNum);
		for (int i = 0; i < arrNum.length; i++) {
		if(arrNum[i] != i) {
			
			
			System.out.println("Missing element in an array is " + i) ;
			break;
			
		}
		
			
			
			
		}

	}



	}

