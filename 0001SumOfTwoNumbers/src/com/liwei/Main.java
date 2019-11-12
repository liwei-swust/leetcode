package com.liwei;

import java.util.Arrays;
/**
 * 
 * @author liwei
 *
 */
public class Main {
	public static void main(String[] args) {
		AbstractSolution solution = new Solution1();
//		int [] nums = {2,7,11,15};
//		int target = 9;
		int [] nums = {3,3};
		int target = 6;
		System.out.println(Arrays.toString(solution.twoSum(nums, target)));
	}
}
