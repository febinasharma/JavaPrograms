package javaPrgm;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num,originalNumber,remainder,result=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=in.nextInt();
		originalNumber=num;
		while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
		
		if(num==result)
			System.out.println("The number is an Armstrong number");
		else
			System.out.println("The number is not an Armstrong number");

	}

}
