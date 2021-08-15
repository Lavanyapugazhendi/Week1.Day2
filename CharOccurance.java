package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Happy day";
		int character = 0;
		char[] charArray = str.toCharArray();
		int str1 =charArray.length;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'y') {
				character++;
				
				
			}
			
		}
		System.out.println(character);

	}

}
