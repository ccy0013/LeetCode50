import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void printQuestions() {
		System.out.println("");
		System.out.println("**********************************************");
		System.out.println("0 - Quit");
		System.out.println("1 - Two Sum I");
		System.out.println("2 - Two Sum II");
		System.out.println("3 - Two Sum III");
		System.out.println("4 - Valid Palindrome");
		System.out.println("5 - StrStr");
		System.out.println("6 - Reverse Word in String I");
		System.out.println("7 - Reverse Word in String II");
		System.out.println("**********************************************");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		printQuestions();

		while(sc.hasNext()){
			
			int choice = sc.nextInt();
			
			if(choice==0)	break;
			
			switch(choice) {
			case 1:
				// Problem 1: Two Sum
				{
					int[] nums = { 4, 2, 1, 6, 8, 3, 13 };
					int target = 8;
					
					int[] result = TwoSum.findTwoSum(nums, target);

					
					System.out.println("[Array]: " + Arrays.toString(nums));
					System.out.println("[Target]: " + target);					
					System.out.println("[Index1]: " + result[0] + "   " + "[Index2]: " + result[1]);
				}
				
				break;
				
			case 2:
				// Problem 2: Two Sum II
				{
					int[] nums = { 1, 2, 4, 8, 9, 11, 15, 22 };
					int target = 13;
					
					int[] result = TwoSumII.findTwoSumII(nums, target);

					System.out.println("[Array]: " + Arrays.toString(nums));
					System.out.println("[Target]: " + target);
					System.out.println("[Index1]: " + result[0] + "   " + "[Index2]: " + result[1]);
				}
				break;
				
			case 3:
				// Problem 3: Two Sum III
				{
					TwoSumIII ts = new TwoSumIII();
					ts.add(1);
					ts.add(3);
					ts.add(1);
					ts.add(5);
					ts.add(8);
					ts.add(2);
					ts.add(15);
					
					int target = 2;
					
					System.out.println("[Numbers]: " );
					System.out.println("[Target]: " + target);
					System.out.println(ts.find(target));
					
					target = 11;
					
					System.out.println("[Target]: " + target);
					System.out.println(ts.find(target));
					
					target = 15;
					System.out.println("[Target]: " + target);
					System.out.println(ts.find(target));
				}
				break;
				
			case 4:
				// Problem 4: Valid Palindrome
				{
					String s = "A man, a plan, a canal: Panama";
					System.out.println("[String]: " + s);
					System.out.println(ValidPalindrome.isPalindrome(s));
					
					s = "race a car";
					System.out.println("[String]: " + s);
					System.out.println(ValidPalindrome.isPalindrome(s));
				}
				break;
				
			case 5:
				// Problem 5: StrStr
				{
					String haystack = "abccccdefdbacg";
					String needle = "dba";
					
					System.out.println("[haystack]: " + haystack);
					System.out.println("[needle]: " + needle);
					System.out.println(StrStr.strStr(haystack, needle));
					
					needle = "dbc";
					
					System.out.println("[haystack]: " + haystack);
					System.out.println("[needle]: " + needle);
					System.out.println(StrStr.strStr(haystack, needle));
				}
				break;
				
			case 6:
				// Problem 6: Reverse Word in String
				{
					String s = " the  sky is  blue   ";
					System.out.println("[String]: " + s);
					System.out.println(ReverseWordsInString.reverseWordsInString(s));
				}
				break;
				
			case 7:
				// Problem 7: Reverse Word in String II (In place)
				{
					char[] s = { 't', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l',
							'u', 'e' };
					
					System.out.print("[String]: ");
					for(char c: s)
						System.out.print(c);
					System.out.println("");
					
					ReverseWordsInStringII.reverseWordsInStringII(s);
					
					System.out.print("[Result]: ");
					for(char c: s)
						System.out.print(c);
					System.out.println("");
				}
				break;
				
			default:
				throw new IllegalArgumentException("Wrong input");
			}
			printQuestions();

		}
		
		sc.close();
	}
}