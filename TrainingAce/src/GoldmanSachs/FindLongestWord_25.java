package GoldmanSachs;

/*
 * https://lion.app.box.com/folder/49843502281
 * https://www.geeksforgeeks.org/find-largest-word-dictionary-deleting-characters-given-string/
 */

public class FindLongestWord_25 {

	static boolean isSubSequence(String str1, String str2) {
		int m = str1.length(), n = str2.length();

		char str1c[] = str1.toCharArray();
		char str2c[] = str2.toCharArray();
		int j = 0; // For index of str1 (or subsequence

		// Traverse str2 and str1, and compare current
		// character of str2 with first unmatched char
		// of str1, if matched then move ahead in str1
		for (int i = 0; i < n && j < m; i++)
			if (str1c[j] == str2c[i])
				j++;

		// If all characters of str1 were found in str2
		return (j == m);
	}

	static String longestWord(String arr[], String str) {
		String result = "";
		int length = 0;

		// Traverse through all words of dictionary
		for (String word : arr) {
			// If current word is subsequence of str and is largest
			// such word so far.
			if (length < word.length() && isSubSequence(word, str)) {
				result = word;
				length = word.length();
			}
		}

		// Return longest string
		return result;
	}

	public static boolean pass() {
		String dict[] = { "ale", "apple", "monkey", "plea" };
		boolean r = "apple".equals(longestWord(dict, "applemansoor"));
		return r;
	}

	public static void main(String[] args) {
		if (pass()) {
			System.out.println("Pass");
		} else {
			System.err.println("Fails");
		}
	}

}
