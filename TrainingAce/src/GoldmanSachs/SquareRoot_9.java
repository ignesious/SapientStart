package GoldmanSachs;

/*
 * https://lion.app.box.com/folder/49843502281
 */
public class SquareRoot_9 {

	public static double squareRoot(double number) {
		/*double threshold = 0.001;
		double guess = x / 2.0;
		for (int iterations = 500; iterations > 0 && Math.abs(guess * guess - x) > threshold; iterations--) {
			guess = guess - ((guess * guess - x) / (2.0 * guess));
		}

		return guess;*/
		
		
		double t;
		double squareRoot = number / 2;
		do {
		t = squareRoot;
		squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
		
	}

	public static void main(String args[]) {
		double[] inputs = { 2, 37, 100 };
		double[] expected_values = { 1.41421, 6.082763, 10 };
		double threshold = 0.001;
		for (int i = 0; i < inputs.length; i++) {
			if (Math.abs(squareRoot(inputs[i]) - expected_values[i]) > threshold) {
				System.out.printf("Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i],
						squareRoot(inputs[i]));
			}
		}
		System.out.println("All tests passed");
	}

}
