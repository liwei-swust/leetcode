package com.liwei;

import java.util.HashMap;
import java.util.Map;

/**
 * 第二个想法，减少时间消耗，去掉内存循环
 * 时间复杂度O(n)，空间复杂度是O(1) 
 * @author liwei
 *
 */
public class Solution2 extends AbstractSolution{

	@Override
	public int[] twoSum(int[] nums, int target) {
		//HashMap 初始化考虑因素:1.哈希因子0.75尽量不要rehash 2.值应该是2^倍数，减少hash碰撞
		//初始化数据（size）应该满足:size.0.75>userSize 
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
		for(int i = 0 ; i<nums.length ; i++){
			int dif = target - nums[i];
			if(map.get(dif) != null){
				return new int[]{i,map.get(dif)};
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
