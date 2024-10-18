package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromArrayUsingArrayList {

	public static void main(String[] args) {
//		int arr[]= {2,6,1,8,1,5,3,10,12,11,3,6,8,12,2,1,3,10};
//		List<Integer> arrList=new ArrayList<Integer>();
//		for(int i=0;i<arr.length;i++)
//		{
//			if(!arrList.contains(arr[i]))
//			{
//				arrList.add(arr[i]);
//			}
//		}
//		System.out.print(" "+arrList);
		
		//******************** REMOVE DUPLICATES FROM ARRAYLIST USING LIST ******************
		
		List<String> arrList=new ArrayList<String>(Arrays.asList("the","java","is","the","Java","t","ja"));
		List<String> resultList=new ArrayList<String>();
		for(String s:arrList)
		{
			if(!resultList.contains(s.toLowerCase()))
			{
				resultList.add(s);
			}
		}
		System.out.println(resultList);
	}

}
