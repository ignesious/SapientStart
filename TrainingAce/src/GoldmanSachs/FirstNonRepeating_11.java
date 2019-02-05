package GoldmanSachs;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * https://lion.app.box.com/folder/49843502281
 */
public class FirstNonRepeating_11 {

	public static char findFirst(String input)
	  {
	
		char inputArr[]=input.toCharArray();
		LinkedHashMap<Character,Integer> checking= new LinkedHashMap<>();
		
		for(int i=0;i<inputArr.length;i++)
		{
			if(checking.get(inputArr[i])!=null)
			{
				checking.put(inputArr[i], checking.get(inputArr[i])+1);
			}
			else
			{
				checking.put(inputArr[i],1);
			}
		}
		
		System.out.println(checking);
		
		for(Map.Entry<Character, Integer> a:checking.entrySet())
		{
			if(a.getValue()==1)
				return a.getKey();
		}
	    return( ' ' );
	  }

	  public static void main(String args[])
	  {

	    String[] inputs = {"apple","racecars", "ababdc","aaaaa"};
	    char[] outputs = {'a', 'e', 'd' ,' ' };

	    boolean result = true;
	    for(int i = 0; i < inputs.length; i++ )
	    {
	      result = result && findFirst(inputs[i]) == outputs[i];
	      if(!result)
	        System.out.println("Test failed for: " + inputs[i]);
	      else
	        System.out.println("Test passed for: " + inputs[i]);
	    }
	  }

}
