package javaPkg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FindDiffSalaryFromTwoMonths {

	public static void main(String[] args) {
		Map<Integer,Integer> octMap= new HashMap<Integer,Integer>();
		octMap.put(1, 4000);
		octMap.put(5, 3790);
		octMap.put(4, 4890);
		octMap.put(7, 4220);
		octMap.put(6, 4111);
		octMap.put(9, 3790);
		
		Map<Integer,Integer> novMap=new HashMap<Integer,Integer>();
		novMap.put(1, 4500);
		novMap.put(5, 3790);
		novMap.put(4, 4890);
		novMap.put(12,3876);
		novMap.put(6, 4111);
		novMap.put(9, 3790);
		novMap.put(11, 5790);
		
//		TreeMap<Integer,Integer> sortedOct=new TreeMap<Integer,Integer>(octMap);
//		TreeMap<Integer,Integer> sortedNov=new TreeMap<Integer,Integer>(novMap);
		Map<Integer,Integer> output=new HashMap<Integer,Integer>();
		output=findCommonData(octMap,novMap);
		System.out.println(output);
		differentDataFromNovAndOct(output,novMap,octMap);
		
////		System.out.println(sortedOct);
////		System.out.println(sortedNov);
////		sortedOct.get(4);
////		

	}
	
	private static void differentDataFromNovAndOct(Map<Integer, Integer> output, Map<Integer, Integer> novMap,Map<Integer,Integer> octMap) {
		Map<Integer,Integer> tempNov=new HashMap<Integer,Integer>(novMap);
		Map<Integer,Integer> tempOct=new HashMap<Integer,Integer>(octMap);
		Iterator<Integer> it=output.keySet().iterator();
		while(it.hasNext())
		{
			int temp=it.next();
			if(output.containsKey(temp)==(tempNov.containsKey(temp)))
			{
				tempNov.remove(temp);
			}
			if(output.containsKey(temp)==(tempOct.containsKey(temp)))
			{
				tempOct.remove(temp);
			}
		}
		System.out.println("Additional data from November:" +tempNov);
		System.out.println("Additional data from October:" +tempOct);
	}

	private static Map<Integer,Integer> findCommonData(Map<Integer,Integer> octMap,Map<Integer,Integer> novMap)
	{
		Map<Integer, Integer> output = new HashMap<Integer, Integer>(); 
		Iterator<Integer> it=octMap.keySet().iterator();
		while(it.hasNext())
		{
			int temp=it.next();
			if(octMap.get(temp).equals(novMap.get(temp)))
					{
				       output.put(temp, octMap.get(temp));
					}
		}		
		
		return output;
		
	}

}
