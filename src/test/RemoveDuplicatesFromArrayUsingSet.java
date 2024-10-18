package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayUsingSet {

	public static void main(String[] args) {
		int arr[]= {2,6,1,8,1,5,3,10,12,11,3,6,8,12,2,1,3,10};
		Set<Integer> newSet=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			newSet.add(arr[i]);
		}
		
		System.out.print(" "+newSet);
		
//**************************** REMOVE DUPLICATES FROM ARRAYLIST USING SET ******************************
//		List<Integer> arrList=new ArrayList<Integer>(Arrays.asList(2,6,1,8,1,5,3,10,12,11,3,6,8,12,2,1,3,10));
//		Set<Integer> newSet=new HashSet<Integer>(arrList);
//		System.out.print(" "+newSet);
	}

}
