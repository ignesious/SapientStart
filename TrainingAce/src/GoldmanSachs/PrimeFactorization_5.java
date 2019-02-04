package GoldmanSachs;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * https://lion.app.box.com/folder/49843502281
 */
public class PrimeFactorization_5 {

	 public static ArrayList<Integer> primeFactorization(int x)
	  {
	  ArrayList<Integer> factors = new ArrayList<Integer>();
	  if( x < 2 )
	    return factors;
	  for(int i = 2; i <= x; i++) 
	  {
	    while( x % i == 0 )
	    {
	    x = x / i;
	    factors.add(i);  
	    }    
	  }
	  return factors;
	  }

	public static void main(String args[])
	  {
		
		System.out.println(primeFactorization(6) + " " + primeFactorization(5)); 
		if(primeFactorization(6).equals(Arrays.asList(2,3)) 
				&& 
				primeFactorization(5).equals(Arrays.asList(5))
				) {
			System.out.println("All passed");
		}else {
			System.out.println("Failed");
		}
	  
	  }
}
