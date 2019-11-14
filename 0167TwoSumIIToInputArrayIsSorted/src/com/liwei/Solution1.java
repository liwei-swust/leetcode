package com.liwei;
/**
 * 第一个想法
 * @author liwei
 *
 */
public class Solution1 extends AbstractSolution {

	@Override
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		if(length < 2){
			return null;
		}
		if(nums[0]+nums[1] > target){
			return null;
		}
		
		for(int i = 0 ; i<length ;i++){
			for(int j = length-1 ; j > i ;j--){
				int sum = nums[i]+nums[j];
				if(sum == target){
					return new int[] {i+1,j+1};
				}
			}
		}
		
		return null;
	}
}
