package com.training.Random;

import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
 /*
  * https://www.geeksforgeeks.org/sorting-a-hashmap-according-to-values/
  */



class customComparator implements Comparator<Map.Entry<String, Integer> >
{

	@Override
	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue()-o2.getValue();
	}
	
}
public class SortingByValues {
 
    // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new customComparator());
         
        // put data from sorted list to hashmap 
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
 
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
 
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);
 
        // print the sorted hashmap
        /*for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() + 
                          ", Value = " + en.getValue());
        }
        */
        
        //momos version
        
        for(String a:hm.keySet()){
        	System.out.println("Key = "+ a +"  value=" + hm.get(a));
        }
        
        
        
    }
}