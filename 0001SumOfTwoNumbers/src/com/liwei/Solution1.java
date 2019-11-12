package com.liwei;
/**
 * 第一个想法
 * 时间换空间，时间复杂度O(n^2)，空间复杂度是O(1) 
 * @author liwei
 *
 */
public class Solution1 extends AbstractSolution{

	@Override
	public int[] twoSum(int[] nums, int target) {
		int [] result = new int[2];
		for(int i = 0 ; i<nums.length ; i++){
			for(int j = i+1 ; j<nums.length ; j++){
				if(target == nums[i] + nums[j]){
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}

}
