package com.liwei;

abstract class AbstractSolution {
	/**
	 * 给定一个整数数组 nums 和一个目标值 target，在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
	     每种输入只会对应一个答案。但是，不能重复利用这个数组中同样的元素。<p>
	    例如:<p>给定 nums = [2, 7, 11, 15], target = 9,因为 nums[0] + nums[1] = 2 + 7 = 9，所以返回 [0, 1]
	 * @param nums
	 * @param target
	 * @return
	 */
    public abstract int[] twoSum(int[] nums, int target);
}
