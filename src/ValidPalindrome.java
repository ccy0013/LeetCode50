


/* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome. "race a car" is not a palindrome. 
 */

class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {
		
		if(s==null || s.length()==0)	return false;
		
		int p1 = 0, p2 = s.length()-1;
		
		while(p1<p2) {
			while(p1<p2 && !Character.isLetterOrDigit(s.charAt(p1)))	p1++;
			while(p1<p2 && !Character.isLetterOrDigit(s.charAt(p2)))	p2--;
			
			if(s.charAt(p1)==s.charAt(p2) || Math.abs(s.charAt(p1)-s.charAt(p2))==Math.abs('A'-'a')) {
				p1++;
				p2--;
			} else
				return false;
		}
		return true;
	}
}
