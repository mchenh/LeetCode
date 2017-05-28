/*
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
 */
public class SingleNumber_136 {
  public int singleNumber(int[] nums) {
    int count = 0, result = 0;
    for(int i=0; i<nums.length; i++) {
        int temp = nums[i];
        for(int j=0; j<nums.length; j++) {
            if(nums[i] == nums[j])
                count++;
        }
        if(count == 1) {
            result = nums[i];
            break;
        }
        count = 0;
    }
    System.out.println(result);
    return result;
}
}
