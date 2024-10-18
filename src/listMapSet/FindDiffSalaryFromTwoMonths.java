package listMapSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FindDiffSalaryFromTwoMonths {

	public static void main(String[] args) {
		Map<Integer,Double> octMap= new HashMap<Integer,Double>();
		octMap.put(1, 4000.12);
		octMap.put(5, 3790.33);
		octMap.put(4, 4890.21);
		octMap.put(7, 4220.11);
		octMap.put(6, 4111.00);
		octMap.put(9, 3790.10);
		
		Map<Integer,Double> novMap=new HashMap<Integer,Double>();
		novMap.put(1, 4000.13);
		novMap.put(5, 3790.33);
		novMap.put(4, 4890.21);
		novMap.put(12,3876.89);
		novMap.put(6, 4111.00);
		novMap.put(9, 3790.10);
		novMap.put(11, 5790.92);
		
//		TreeMap<Integer,Integer> sortedOct=new TreeMap<Integer,Integer>(octMap);
//		TreeMap<Integer,Integer> sortedNov=new TreeMap<Integer,Integer>(novMap);
		Map<Integer,Double> output=new HashMap<Integer,Double>();
		output=findCommonData(octMap,novMap);
		System.out.println(output);
		differentDataFromNovAndOct(output,novMap,octMap);
		
////		System.out.println(sortedOct);
////		System.out.println(sortedNov);
////		sortedOct.get(4);
////		

	}
	
	private static void differentDataFromNovAndOct(Map<Integer, Double> output, Map<Integer, Double> novMap,Map<Integer,Double> octMap) {
		Map<Integer,Double> tempNov=new HashMap<Integer,Double>(novMap);
		Map<Integer,Double> tempOct=new HashMap<Integer,Double>(octMap);
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

	private static Map<Integer,Double> findCommonData(Map<Integer,Double> octMap,Map<Integer,Double> novMap)
	{
		Map<Integer, Double> output = new HashMap<Integer, Double>(); 
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
