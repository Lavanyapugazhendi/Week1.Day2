package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "ABBA";
		String str1 = "";
		for (int i = str.length()-1; i>=0; i--) {
			
		str1 = str1 + str.charAt(i);
			
		}
		System.out.println(str1);
		
		if (str.equals(str1)) {
			System.out.println("It is Palindrome");
			
		} else {
			System.out.println("It is not palindrom");

		}
		

	}

}
