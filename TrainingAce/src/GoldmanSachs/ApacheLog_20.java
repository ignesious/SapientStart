package GoldmanSachs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 * https://lion.app.box.com/folder/49843502281
 */
public class ApacheLog_20 {

	public static String findTopIpaddress(String[] lines) {
		Map<String, Integer> counter = new HashMap<>();
		Arrays.stream(lines).forEach((line) -> {
			String ipAddress = line.split(" ")[0];
			Integer count = counter.getOrDefault(ipAddress, 0);
			counter.put(ipAddress, count + 1);
		});

		int maxCount = 0;
		String MaxKey = " ";
		for (Map.Entry<String, Integer> e : counter.entrySet()) {
			if (maxCount < e.getValue()) {
				maxCount = e.getValue();
				MaxKey = e.getKey();
			}
		}

		return MaxKey;

	}

	public static void main(String[] args) {

		String lines[] = new String[] { "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213",
				"10.0.0.2 - log entry 133132" };
		String result = findTopIpaddress(lines);

		if (result.equals("10.0.0.1")) {
			System.out.println("Test passed");

		} else {
			System.out.println("Test failed");

		}

	}

}
