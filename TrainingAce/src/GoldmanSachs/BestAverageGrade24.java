package GoldmanSachs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * https://lion.app.box.com/folder/49843502281
 */

public class BestAverageGrade24 {

	public static Integer bestAverageGrade(String[][] scores) {


		Map<String,String> studentMap=new HashMap<>();
		
		if (scores.length == 0) {
			return 0;
		}

		for (String[] scoreRow : scores) {

			  if(scoreRow.length != 2)
			        return 0;
			
			  String student = scoreRow[0];
		      Integer score  = Integer.parseInt(scoreRow[1]);
			
		      if(studentMap.get(student)!=null)
		      {
		    	  
		    	  String temp=studentMap.get(student);
		    	  String tempa[]=temp.split(",");
		    	  int newScore=Integer.parseInt(tempa[0])+score;
		    	  int newCount=Integer.parseInt(tempa[1])+1;
		    	  studentMap.put(student, newScore+","+newCount);
		      }
		      else
		      {
		    	  studentMap.put(student,score+","+1);
		    	  
		      }
		      
		}
		
//		System.out.println(studentMap);
		
		 double average=-Double.MAX_VALUE;
		 String name=" ";
		
		 for(Map.Entry<String, String> e : studentMap.entrySet())
		 {
			 double temp=0;
			 
	    	  String tempa[]=e.getValue().split(",");
	    	  int Score=Integer.parseInt(tempa[0]);
	    	  int Count=Integer.parseInt(tempa[1]);
	    	  temp=Score/Count;
	    	  if(average<temp)
	    	  {
	    		  average=temp;
	    		  name=e.getKey();
	    	  }
	    	  
		 }
		 
//	System.out.println("Best student  "+name+"average score   "+average);	
		
		  return (int)Math.floor(average);
	}

	public static boolean doTestsPass() {
		Map<String[][], Integer> testCases = new HashMap<>();

		testCases.put(new String[][] { { "Bobby", "87" }, { "Charles", "100" }, { "Eric", "64" }, { "Charles", "22" } },
				87);
		testCases.put(new String[][] {}, 0);
		testCases.put(new String[][] { { "Sarah", "91" }, { "Goldie", "92" }, { "Elaine", "93" }, { "Elaine", "95" },
				{ "Goldie", "94" }, { "Sarah", "93" } }, 94);
		testCases.put(new String[][] { { "Janie", "-66" }, { "Janie", "0" }, { "Gina", "-88" }, { "Bobby", "0" },
				{ "Gina", "44" }, { "Bobby", "0" }, { "Bobby", "-6" } }, -2);
		testCases.put(new String[][] { { "Alpha", "99" }, { "Bravo", "99" }, { "Charlie", "99" }, { "Delta", "99" },
				{ "Echo", "99" }, { "Foxtrot", "99" }, { "Foxtrot", "99" } }, 99);
		testCases.put(new String[][] { { "Gerald", "91" }, { "Gerald", "92" } }, 91);
		testCases.put(new String[][] { { "Barry", "-66" }, { "Barry", "-65" }, { "Alfred", "-122" } }, -65);

		boolean passed = true;
		for (Map.Entry<String[][], Integer> entry : testCases.entrySet()) {
			Integer actual = bestAverageGrade(entry.getKey());
			if (actual != entry.getValue()) {
				passed = false;
				System.out.println("Failed for " + Arrays.deepToString(entry.getKey()) + "\n  expected "
						+ entry.getValue() + ", actual " + actual);
			}
		}

		return passed;
	}

	public static void main(String[] args) {
		
//		String[][] s1 = { 
//	               { "Sachin", "-66" },
//	               { "Ishan", "-122" },
//	               { "Sachin", "-65" } };
//
//	     if(bestAverageGrade(s1) == -66) {
//	    	 System.out.println("happy me");
//	     }
		
		
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}
	}

}
