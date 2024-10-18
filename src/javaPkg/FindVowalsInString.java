package javaPkg;

import java.util.Scanner;

public class FindVowalsInString {

	public static void main(String[] args) {
		
		String str;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an Input: ");
		str=in.nextLine();
		
			System.out.println("There is vowal in the String " +str);
//		String str="TARA PRABHU WHAT shoud I add now";
		String[] sp=str.split("\\s+");
		int count=0, a=0,e=0,i=0,o=0,u=0;
		boolean flag=false;
		char ch[]=(str.toLowerCase()).toCharArray();
		for(char s:ch)
		{
			if ((s=='a')||(s=='e')||(s=='i')||(s=='o')||(s=='u'))
			{
				flag=true;
				count+=1;
					if(s=='a')
						a+=1;
					else if(s=='e')
						e+=1;
					else if(s=='i')
						i+=1;
					else if(s=='o')
						o+=1;
					else if(s=='u')
						u+=1;
			}
	
		}
		
		if(flag)
			System.out.println("There is vowal in the String " +str+ " and the number of vowels present is "+count);
		else
			System.out.println("There is no Vowal in the String \" +str");
		
		if(a>0)
			System.out.println("A is repeated "+a+ " times");
		if(e>0)
			System.out.println("E is repeated "+e+ " times");
		if(i>0)
			System.out.println("I is repeated "+i+ " times");
		if(o>0)
			System.out.println("O is repeated "+o+ " times");
		if(u>0)
			System.out.println("U is repeated "+u+ " times");
		
		System.out.println("Split words in a Sentance");
		for(String s:sp)
			System.out.println(s);

	}
	


}
