package listMapSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		String str="this is a java program and java is java";
//		char chStr[]=str.toCharArray();
		String str1[]=str.split(" ");
		Map<String,Integer> strMap=new HashMap<String,Integer>();
		for(String st:str1)
		{
			if(strMap.containsKey(st))
			{
				strMap.put(st, strMap.get(st)+1);
				
			}
			else
			{
				strMap.put(st, 1);
			}
		}
		
		System.out.println(strMap);
		
		Set<String> keySet=new HashSet<String>(strMap.keySet());
		for(String ks:keySet) {
			
			if(strMap.get(ks)>1)
			{
				System.out.println("String : "+ks+" ------ Count:"+strMap.get(ks));
			}
		}
	}

}
