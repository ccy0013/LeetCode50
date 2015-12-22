import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class TwoSumIII {
	public HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
	
	public void add(int num) {
		if(nums.containsKey(num))
			nums.put(num, nums.get(num)+1);
		else
			nums.put(num, 1);
	}
	
	public boolean find(int target) {
		
		Iterator<Map.Entry<Integer, Integer>> itr = nums.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();
			
			int num = entry.getKey();
			
			if(nums.containsKey(target-num)) {
				if(num == target-num)
					return nums.get(num) > 1;
				else
					return true;
			}
		}
		return false;
	}
}
