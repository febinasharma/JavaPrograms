package javaPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		int j;

		ArrayList<Integer> arrList=new ArrayList<Integer>(Arrays.asList(1,2,0,1,4,7,0,0,89,34,0,1,6,4,0));
//********************** USING SET ************************************
//		Set<Integer> remDupSet= new HashSet<Integer>(arrList);
//		System.out.println(remDupSet);
//		
//		ArrayList<Integer> arrList1=new ArrayList<Integer>(remDupSet);
//		System.out.println(arrList1);
		
//***********************************************************************
		Collections.sort(arrList);
		System.out.println("Before : "+arrList);
		for(int i=0;i<arrList.size()-1;i++)
		{
			j=i+1;
			if(arrList.get(i)==arrList.get(j))
			{
				arrList.remove(j);
				i--;
			}
		}
		System.out.println("After : "+arrList);
	}

}
