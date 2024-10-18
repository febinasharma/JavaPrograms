package javaPrgm;

import java.util.Scanner;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		String temp="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=in.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
			
		if(str.equals(temp))
			System.out.println("The String "+str+ " is a Palindrome");
		else
			System.out.println("The String "+str+ " is Not Palindrome");

	}

}
