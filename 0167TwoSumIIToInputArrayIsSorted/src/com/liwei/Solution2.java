package com.liwei;
/**
 * 指针碰撞法
 * @author liwei
 *
 */
public class Solution2 extends AbstractSolution {

	@Override
	public int[] twoSum(int[] nums, int target) {
			int left = 0 ;
			int right = nums.length -1;
			int sum = 0;
			while (left < right) {
				try{
					sum = addExact(nums[left] , nums[right]);
				}catch (ArithmeticException e) {
					if("integer overflow".equals(e.getMessage())){	
						right--;
						continue;
					}else{
						throw e;
					}
				}
				if(target == sum){
					return new int[] {left+1,right+1};
				}else if(sum < target){
					left++;
				}else{
					right--;
				}
			}
			return null;
		}
	
	public  int addExact(int x, int y) {
        int r = x + y;
        if (((x ^ r) & (y ^ r)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return r;
    }
}
