/* Given an input string s, reverse the string word by word.
 * For example, given s = "the sky is blue", return "blue is sky the".
 */

class ReverseWordsInString {
	public static String reverseWordsInString(String s) {
		if(s==null || s.length()<2)	return s;
		
		StringBuilder result = new StringBuilder();
		
		for(int i=s.length()-1; i>=0; i--) {
			String word = "";
			
			while(s.charAt(i)!=' ') {
				word = s.charAt(i--) + word;
			}
			
			if(word.length()>0)
				result.append(word).append(' ');
		}
		return result.toString().trim();
	}
}
