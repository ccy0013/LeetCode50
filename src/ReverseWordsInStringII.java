
/* Similar to Question [6. Reverse Words in a String], but with the following constraints:
 * “The input string does not contain leading or trailing spaces and the words are always separated 
 * by a single space.”
 *
 * Could you do it in-place without allocating extra space?
 */

class ReverseWordsInStringII {
	private static void reverseWord(char[] s, int start, int end) {
		for(int i=start, j=end; i<j; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}
	
	public static void reverseWordsInStringII(char[] s) {
		if(s==null || s.length<2)	return;
		
		reverseWord(s, 0, s.length-1);
		
		int i=0;
		while(i<s.length) {
			if(s[i]==' ') {
				i++;
				continue;
			}
			
			int j=0;
			while(i+j<s.length && s[i+j]!=' ')
				j++;
			
			reverseWord(s, i, i+j-1);
			
			i += j;
		}
	}
}
