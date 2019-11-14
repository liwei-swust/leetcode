package com.liwei;

import java.util.Arrays;

/**
 * 
 * @author liwei
 *
 */
public class Main {
	public static void main(String[] args) {
		//AbstractSolution solution = new Solution1();
		AbstractSolution solution = new Solution2();
		int[] nums = {1 , 8, 10, 2147483647};
		//int[] nums = {1 , 8, 10, 21};
		int target = 9;
		System.out.println(Arrays.toString(solution.twoSum(nums, target)));
	}
}
