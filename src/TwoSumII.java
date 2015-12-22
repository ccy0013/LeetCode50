// Similar to Question [1. Two Sum], except that the input array is already sorted in ascending order.

class TwoSumII {
	public static int[]  findTwoSumII(int[] nums, int target) {
		if(nums==null || nums.length==0)	return null;
				
		int index1 = 0, index2 = nums.length-1;
		
		while(index1 < index2) {
			if(nums[index1] + nums[index2] < target)
				index1++;
			else if(nums[index1] + nums[index2] > target)
				index2--;
			else
				return new int[]{ index1+1, index2+1 };
		}
		
		throw new IllegalArgumentException("No Two Sum Solution");
	}
}
