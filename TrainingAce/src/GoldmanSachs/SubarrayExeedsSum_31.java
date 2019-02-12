package GoldmanSachs;

/*
 * https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
 * https://lion.app.box.com/folder/49843502281
 */
public class SubarrayExeedsSum_31 {

	public static int subArrayExceedsSum(int arr[], int target) {
		int i = 0, j = 0, length = Integer.MAX_VALUE, size = arr.length;

		if (target <= 0)
			return 0;

		if (size < 1)
			return -1;

		int currsum = arr[0];
		while (true) {
			if (currsum >= target)
				if (i == j)
					return (1);
				else {
					if (j - i + 1 < length)
						length = j - i + 1;
					currsum -= arr[i];
					i++;
				}
			else {
				j++;
				if (j == size)
					break;
				else
					currsum += arr[j];
			}
			;
		}
		;

		if (length == Integer.MAX_VALUE)
			return -1;

		return length;
	}

	// TODO Auto-generated method stub
	public static void doTestsPass() {
		boolean result = true;
		int[] arr = { 1, 2, 3, 4 };
		result = result && subArrayExceedsSum(arr, 6) == 2;
		result = result && subArrayExceedsSum(arr, 12) == -1;
		result = result && subArrayExceedsSum(arr, 10) == 4;
		result = result && subArrayExceedsSum(arr, 4) == 1;

		int[] arr2 = {};
		result = result && subArrayExceedsSum(arr2, 0) == 0;
		result = result && subArrayExceedsSum(arr2, 2) == -1;

		if (result) {
			System.out.println("All tests pass\n");
		} else {
			System.out.println("There are test failures\n");
		}
	};

	public static void main(String[] args) {
		doTestsPass();
	}

}
