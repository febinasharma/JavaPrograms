package javaPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindExtraElementsInAList {

	public static void main(String[] args) {
		
		List<Integer> octList=new ArrayList<Integer>(Arrays.asList(7,6,2,9,12,10,15,16,11,1,3,5));
		List<Integer> novList=new ArrayList<Integer>(Arrays.asList(7,6,2,12,15,11,1,3,5,17,20,19));
		
		Collections.sort(octList);
		Collections.sort(novList);
		System.out.println(octList);
		System.out.println(novList);
		
		
		System.out.println("Adiitional Elements in Oct List:"+findExtraElementFromOct(octList,novList));
		System.out.println("Adiitional Elements in Nov List:"+findExtraElementFromNov(octList,novList));
		
//		return newList;
//			octList.removeAll(novList);
//			System.out.println(octList);
//			Set octSet=new HashSet<Integer>(octList);
//			Set novSet=new HashSet<Integer>(novList);
		
	}
		
		private static List<Integer> findExtraElementFromOct(List<Integer> octList,List<Integer> novList)
		{
			List<Integer> oList=new ArrayList<Integer>(octList);
			List<Integer> nList=new ArrayList<Integer>(novList);
		oList.removeAll(nList);
		return oList;
		}


		private static List<Integer> findExtraElementFromNov(List<Integer> octList,List<Integer> novList)
		{
			List<Integer> oList1=new ArrayList<Integer>(octList);
			List<Integer> nList1=new ArrayList<Integer>(novList);
			nList1.removeAll(oList1);
			return nList1;
		}

	


}
