package GoldmanSachs;

/*
 * https://lion.app.box.com/folder/49843502281
 * https://www.youtube.com/watch?v=LPFhl65R7ww
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/binarysearch/MedianOfTwoSortedArrayOfDifferentLength.java
 */
public class MediantwoSorted_27 {

	public static double logic(int[] input1, int[] input2) {
		if (input1.length > input2.length) {
			return logic(input2, input1);
		}
		int x = input1.length;
		int y = input2.length;

		int low = 0;
		int high = x;
		while (low <= high) {
			int partitionX = (low + high) / 2;
			int partitionY = (x + y + 1) / 2 - partitionX;

			// if partitionX is 0 it means nothing is there on left side. Use -INF for
			// maxLeftX
			// if partitionX is length of input then there is nothing on right side. Use
			// +INF for minRightX
			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
			int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];

			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
			int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];

			if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
				// We have partitioned array at correct place
				// Now get max of left elements and min of right elements to get the median in
				// case of even length combined array size
				// or get max of left for odd length combined array size.
				if ((x + y) % 2 == 0) {
					return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
				} else {
					return (double) Math.max(maxLeftX, maxLeftY);
				}
			} else if (maxLeftX > minRightY) { // we are too far on right side for partitionX. Go on left side.
				high = partitionX - 1;
			} else { // we are too far on left side for partitionX. Go on right side.
				low = partitionX + 1;
			}
		}

		// Only we we can come here is if input arrays were not sorted. Throw in that
		// scenario.
		throw new IllegalArgumentException();
	}

	public static boolean pass() {
		boolean result = true;
		result = result && logic(new int[] { 1, 3 }, new int[] { 2, 4 }) == 2.5;
		return result;
	};

	public static void main(String[] args) {
		if (pass()) {
			System.out.println("pass");
		} else {
			System.out.println("some failures");
		}
	}

}
