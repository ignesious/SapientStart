package GoldmanSachs;
/*
 * https://lion.app.box.com/folder/49843502281
 */

public class RunLengthEncoding_10 {

	public static String rle(String input) {

		/*
		 * if(input.isEmpty()){ return ""; }
		 * 
		 * StringBuffer result = new StringBuffer();
		 * 
		 * char lastSeen = 0; int count = 1;
		 * 
		 * for(int i = 0; i < input.length(); i++){ char current = input.charAt(i);
		 * if(lastSeen == current){ count++; } else { if(lastSeen != 0){
		 * result.append(lastSeen).append(count); } count = 1; lastSeen = current; } }
		 * result.append(lastSeen).append(count); return result.toString();
		 */
		StringBuffer result = new StringBuffer();
		// int longestStart = -1;
		// int longestLength = 0;
		int i = 1;
		int length = input.length();
		char temp = ' ';
		if (input.isEmpty()) {
			return "";
		} else if (length == 1) {
			return result.append(input.charAt(0) + "1").toString();
		}

		else {
			while (i < length) {
				//int start = i - 1;
				int currentLength = 1;
				while (i < length && input.charAt(i) == input.charAt(i - 1)) {
					temp = input.charAt(i);
					i++;
					currentLength++;
				}
				/*
				 * if(currentLength > longestLength){ longestStart = start; longestLength =
				 * currentLength; }
				 */
				result.append(temp).append(currentLength);

				i++;
			}
		}
		return result.toString();

	}

	public static void main(String[] args) {

		System.out.println(rle("aaabbcccccddd"));

		
		  if("".equals(rle("")) && "a1".equals(rle("a")) && "a3b2c5d3".equals(rle("aaabbcccccddd"))){
		 System.out.println("Passed"); }else { System.out.println("Failed"); }
		 
	}

}
