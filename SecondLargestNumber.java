package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] arrNum = { 55, 66, 5, 300, 80, 1000, 1 };
		
		Arrays.sort(arrNum);
		System.out.println("sorted Arrays");
		for (int i = 0; i <= arrNum.length - 1; i++) {
			System.out.println("arrNum ["+ i +"]=" + arrNum[i]);
			
			
		
			
		}
		
		System.out.println("Second Largest element in the array "  + arrNum[arrNum.length-2]);
	}

}
