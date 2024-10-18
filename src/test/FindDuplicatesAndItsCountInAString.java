package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesAndItsCountInAString {

	public static void main(String[] args) {
		String str="This is java and java is this java";
		String strArray[]=str.split(" ");
		Map<String,Integer> dupMap=new HashMap<String,Integer>();
		for(String s:strArray)			
		{
			if(dupMap.containsKey(s))
			{
				dupMap.put(s, dupMap.get(s)+1);
			}
			else
				dupMap.put(s, 1);
		}
		
//		Set<String> keySet=new HashSet<String>(dupMap.keySet());
//		for(String key:keySet)
//		{
//			if(dupMap.get(key)>1)
//			{
//				System.out.println("The String "+key+" has "+dupMap.get(key)+" duplicates");
//			}
//		}
		
		Set<Map.Entry<String,Integer>> keySet=dupMap.entrySet();
		System.out.println(keySet);
		for(Map.Entry<String,Integer> entry:keySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ " : "+entry.getValue());
			}
		}

	}

}
