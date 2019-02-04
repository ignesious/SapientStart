package GoldmanSachs;
/*
 * https://lion.app.box.com/folder/49843502281
 */
public class SecondSmallest_4 {

	public static int secondSmallest(int[] x) {

		if (x.length < 2) {
			return x[0];
		}

		int Smallest = Integer.MAX_VALUE; // Max 32 bit integer
		int SecSmallest = Integer.MAX_VALUE;
		int Elem;
		for (int i = 0; i < x.length; i++) {
			Elem = x[i];
			if (Elem < Smallest) {
				SecSmallest = Smallest;
				Smallest = Elem;
			} else if (Elem < SecSmallest) {
				SecSmallest = Elem;
			}
		}
		return (SecSmallest);
	}

	public static void main(String args[]) {

		int[] a = { 0 };
		int[] b = { 0, 1 };

		boolean result = true;
		result &= secondSmallest(a) == 0;
		result &= secondSmallest(b) == 1;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
