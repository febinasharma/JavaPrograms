package javaPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindTheCountOfRepeatingLettersInString {
	
	public static void main(String args[]) {
		String st="";
		int arr[]= {1,2,3,4};
		
//		for(int i=0;i<arr.length;i++)
//		{
//			st=Arrays.toString(arr);
//			
//		}
//		
		String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};
		
		System.out.println(arr);

List<String> al =
  new ArrayList<String>(Arrays.asList(geeks));

System.out.println(al);
//		List<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		
		System.out.println(st);
		String str="missisaga";
		char ch[]=str.toCharArray();
		
		int value=1;
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char s:ch)
		{
			if(map.containsKey(s))
			{
			  value=map.get(s);
			  value+=1;
			  map.put(s, value);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		System.out.println(map);

	}

}
