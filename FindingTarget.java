package hashmap;

import java.util.HashMap;

public class FindingTarget {
	public static int[] findSum(int[] nums, int target) {
		
		HashMap <Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
			
		}
		throw new IllegalArgumentException("No Sum");
	}
	
	public static void main(String[] args) {
		int results[] = {2,3,4};
		int tarResult[] = findSum(results,6);
		System.out.println(tarResult[0] + " " + tarResult[1]);
	}

}
