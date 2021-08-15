package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str = "long";
		String str1 = "short";
	    char[] charArray = str1.toCharArray();
	    char[] charArray2 = str1.toCharArray();
	    boolean flag = true;
	    int s = str.length();
	    int t = str1.length();
	    if (s==t) {
	            Arrays.sort(charArray);
	    		Arrays.sort(charArray2);
	    		for (int i = 0; i < charArray2.length; i++) {
	    			if (charArray[i] != charArray2[i]) 
	    			flag = false;
	    			break;
	    			
	    				}
	    		}
	    	if (flag) {
	    		System.out.println("The two strings are anagram of each other");
				
			} else {
				System.out.println("The two strings are not anagram of each other");

			}
			
		}
	
		
		

	}

       


