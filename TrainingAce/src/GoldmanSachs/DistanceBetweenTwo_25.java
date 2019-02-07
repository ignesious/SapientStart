package GoldmanSachs;
/*
 * https://lion.app.box.com/folder/49843502281
 * https://www.geeksforgeeks.org/minimum-distance-between-words-of-a-string/
 */
public class DistanceBetweenTwo_25 {

	  public static int shortestDistance(String s, String w1, String w2) {
		  if (w1.equals(w2)) { 
	            return 0; 
	        } 
	  
	       // get individual words in a list 
	        String[] words = s.split(" "); 
	        int n = words.length; 
	  
	        // assume total length of the string as 
	        // minimum distance 
	        int min_dist = n + 1; 
	  
	        // Find the first occurrence of any of the two  
	        // numbers (w1 or w2) and store the index of 
	        // this occurrence in prev  
	        int prev = 0, i = 0; 
	        for (i = 0; i < n; i++) { 
	  
	            if (words[i].equalsIgnoreCase(w1) || words[i].equalsIgnoreCase(w2)) { 
	                prev = i; 
	                break; 
	            } 
	        } 
	        // Traverse after the first occurrence  
	        while (i < n) { 
	            if (words[i].equalsIgnoreCase(w1) || words[i].equalsIgnoreCase(w2)) { 
	  
	                // If the current element matches with 
	                // any of the two then check if current  
	                // element and prev element are different  
	                // Also check if this value is smaller than 
	                // minimum distance so far  
	                if ((!words[prev].equalsIgnoreCase(words[i])) && (i - prev) < min_dist) { 
	                    min_dist = i - prev - 1; 
	                    prev = i; 
	                } else { 
	                    prev = i; 
	                } 
	  
	            } 
	            i += 1; 
	  
	        } 
	        System.out.println("min dist" + min_dist);
	        return min_dist; 

		
		  }

		  /**
		   * Returns true if the tests pass. Otherwise, false.
		   */
		  public static boolean doTestsPass() {
		    // todo: implement more tests if you'd like
		    return  shortestDistance(_document, "and", "graphic") == 6 &&
		    		shortestDistance(_document, "and", "graphic") == 14 &&
		    				shortestDistance(_document, "and", "graphic") == 25;
		  }

		  /**
		   * Execution entry point.
		   */
		  public static void main(String[] args) {
		    // Run the tests
//		    if (doTestsPass()) {
//		      System.out.println("All tests pass");
//		    } else {
//		      System.out.println("There are test failures");
//		    }
			  shortestDistance(_document, "and", "graphic");
			  shortestDistance(_document, "and", "graphic");
			  shortestDistance(_document, "and", "graphic");
		  }

		  private static final String _document;
		  static{
		StringBuffer sb = new StringBuffer();
		    sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
		    sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
		    sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

		    _document = sb.toString();
		  }

}
