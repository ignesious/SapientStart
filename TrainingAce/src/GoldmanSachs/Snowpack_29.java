package GoldmanSachs;
/*
 *  https://lion.app.box.com/folder/49843502281
 */

import java.util.Arrays;

public class Snowpack_29 {

	 public static Integer computeSnowpack(Integer[] arr)
	  {
	  // Check for empty array
	  if(arr.length == 0)
	  {
	    return 0;
	  }
	  
	  Integer total = 0;
	  Integer left_highest[] = new Integer[arr.length];
	  Integer left_max = 0;
	  for(Integer i = 0; i < arr.length; i++)
	  {
	    if(arr[i] > left_max)
	    left_max = arr[i];
	    left_highest[i] = left_max;
	  }
	  Integer right_max = 0;
	  for(Integer i = arr.length - 1; i > 0; i--)
	  {
	    if(arr[i] > right_max)
	    right_max = arr[i];
	    if(Math.min(right_max, left_highest[i]) > arr[i])
	    total += Math.min(right_max, left_highest[i]) - arr[i];
	  }
	  
	  System.out.println(Arrays.toString(arr) + ' ' + total);
	  return total;
	  }

	  /*
	  **  Returns true if the tests pass. Otherwise, returns false;
	  */
	  public static boolean doTestsPass()
	  {
	  boolean result = true;
	  result &= computeSnowpack(new Integer[]{0,1,3,0,1,2,0,4,2,0,3,0}) == 13;
	  result &= computeSnowpack(new Integer[]{1,0,0,0,0,0,0,0,0,0,0,1}) == 10;
	  result &= computeSnowpack(new Integer[]{0,0,0,0,0}) == 0;
	  result &= computeSnowpack(new Integer[]{0,0,1,0,0}) == 0;
	  result &= computeSnowpack(new Integer[]{1}) == 0;
	  result &= computeSnowpack(new Integer[]{}) == 0;
	  
	  return result;
	  }

	  /*
	  **  Execution entry point.
	  */
	  public static void main(String[] args)
	  {
	  if(doTestsPass())
	  {
	    System.out.println("All tests pass");
	  }
	  else
	  {
	    System.out.println("Tests fail.");
	  }
	  }

}
