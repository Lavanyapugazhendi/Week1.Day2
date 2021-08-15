package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str  = "lovelydays";
		char[] CharArray = str.toCharArray();
		
		
		for (int i = 0; i < CharArray.length; i++) {
		char str1 = CharArray[i];
		if (i % 2 != 0) {
		str1 =	Character.toUpperCase(str1);
		System.out.println("Changed odd index to upper case:" + str1);
			
			
			
			
			
			
			
		
		
			
				
			}
			
		}
		     

	}

}
