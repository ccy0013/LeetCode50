/* Given an array of integers, find two numbers such that they add up to a specific number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, 
 * where index1 must be less than index2. Please note that your returned answers (both index1 and 
 * index2) are not Zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 */

import java.util.HashMap;

class TwoSum {
	public static int[] findTwoSum(int[] nums, int target) {
		if(nums==null || nums.length==0)	return null;
		
		int[] result = new int[2];
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				result[0] = map.get(target-nums[i]);
				result[1] = i+1;
				break;
			} else {
				map.put(nums[i], i+1);
			}
		}
		
		return result;
	}
	
}
