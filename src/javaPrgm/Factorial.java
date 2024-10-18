package javaPrgm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int result=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=in.nextInt();
		for(int i=num;i>0;i--)
		{
			result*=i;
		}
	System.out.println("Result: "+result);
	}

}
