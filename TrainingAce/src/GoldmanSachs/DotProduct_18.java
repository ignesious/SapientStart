package GoldmanSachs;

/*
 * https://lion.app.box.com/folder/49843502281
 */
public class DotProduct_18 {

	  public static int dotProduct( int[] array1, int[] array2 ) throws IllegalArgumentException {

		//check boundary conditions
		//Null array
		//Empty array
		//Array length is equal

		    int sum = 0;
		    if( array1 == null || array2 == null ||(array1.length!=array2.length)) {
		      throw new IllegalArgumentException( "Null array . Invalid input" );
		    }

		    for( int i = 0; i < array1.length; i++ ) {
		      sum += array1[i] * array2[i];
		    }

		    System.out.println( "Result of the dot product of array1 and array2 is : " + sum );
		    return sum;

		  }

		  public static void main( String[] args ) {

		int[] array1 = { 1, 2 };
		    int[] array2 = { 2, 3 };
		    int result = dotProduct( array1, array2 );

		    if( result == 8 ) {
		      System.out.println( "Passed." );
		      //return true;
		    } else {
		      System.out.println( "Failed." );
		     // return false;
		    }


		  }
}
