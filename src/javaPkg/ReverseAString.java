package javaPkg;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
	String str, temp="";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a String to Reverse:");
	str=in.nextLine();
	//**********************Using String Buffer****************************
	
//	StringBuffer stBuff=new StringBuffer();
//	stBuff.append(str);
//	System.out.println("The reversed string is : "+stBuff.reverse());
//	}
	
	//****************Using char array****************************

//	char[] ch=str.toCharArray();
//	for(int i=ch.length-1;i>=0;i--)
//	{
//		System.out.print(ch[i]);
//	}
	
	//****************Using concatenation****************************
	
	for(int i=str.length()-1;i>=0;i--)
	{
		temp=temp+str.charAt(i);
	}
	System.out.println("The reversed string is : " +temp);
	}
	
}
