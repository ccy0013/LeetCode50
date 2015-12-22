
/* Implement strstr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or –1 if needle is not part of 
 * haystack.
 */

public class StrStr {
	public static int strStr(String haystack, String needle) {
		if(haystack==null || needle==null)	return -1;
		
		if(needle.length()==0)	return 0;
		if(haystack.length()==0)	return -1;
		
		for(int i=0; i<haystack.length()-needle.length()+1; i++) {
			int j=0;
			while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)) {
				j++;
			}		
			if(j==needle.length())	return i;
		}
		return -1;
	}
}
