package stringPrgms;

import java.util.ArrayList;
import java.util.Arrays;

public class StringContainVowals {

	public static void main(String[] args) {

//		System.out.println(stringContainsVowels("Hello")); // true
//		System.out.println(stringContainsVowels("TV")); // false
//
//	}
//
//	public static boolean stringContainsVowels(String input) {
//
//		return input.toLowerCase().matches(".*[aeiou].*");
//		

//***************************************************************
		
	    String str = new String("Hi Welcome to my world!");
	    for(int i=0; i<str.length(); i++) {
	      if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
	          str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
	          str.charAt(i) == 'u')
	        
	        System.out.println("Given string contains vowel " + 
	            str.charAt(i)+" at the index " + i);
	      else if(str.charAt(i)!=' ')
	    	  System.out.println("Given string contains consonant " + 
	  	            str.charAt(i)+" at the index " + i);
	    	  
	    }
	    
//*****************************************************************
//	    String str = "GeeksForGeeks";
//        str = str.toLowerCase();
//        int count = 0,concount=0;
////        String vow ="aeiou";
//        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
//        
////        for(int i=0;i<vow.length();i++)
////        {
////            vowels.add(vow.charAt(i));
////        }
//        for (int i = 0; i < str.length(); i++) {
//            if(vowels.contains(str.charAt(i))){
//                count++;
//            }
//            else
//            	concount++;
//        }
// 
//        // display total count of vowels in string
//        System.out.println("Total no of vowels in string are: " + count);
//        System.out.println("Total no of consonants in string are: " + concount);
	

	}

}