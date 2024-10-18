package stringPrgms;

import java.util.Stack;

public class ReverseAStringUsingRecursion {
	
	void reverseAString(String str)
	{
		if(str.length()<=1|| str==null)
		{
			System.out.println(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverseAString(str.substring(0, str.length()-1));
		}
	}
	
	
	public static void main(String args[])
	{
		String str="RReverse a String";
//		System.out.println(str.length());
		ReverseAStringUsingRecursion rev=new ReverseAStringUsingRecursion();
		rev.reverseAString(str);
	}
	
		
}
