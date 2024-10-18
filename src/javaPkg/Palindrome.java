package javaPkg;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input, palindromeString="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value to check if its Palindrome:");
		input=in.nextLine();
//		System.out.println("Palindrome Input is "+input);

		for(int i=input.length()-1;i>=0;i--)
		{
			palindromeString= palindromeString+input.charAt(i);
		}
//		System.out.println("Palindrome output is:"+palindromeString);
		
		if(input.equals(palindromeString))
		{
			System.out.println("The String "+input+" is a Palindrome");
		}
		else
		{
			System.out.println("The String "+input+" is not a Palindrome");
		}
			
	}

}
