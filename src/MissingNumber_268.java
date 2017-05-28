/*
 *  Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity? 
 */
public class MissingNumber_268 {
  public int missingNumber(int[] nums) {
    if(nums.length>0) {
        ArrayList<Integer> check = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++)
            check.add(nums[i]);
        
        int count = 0;
        for(int i=0; i<check.size(); i++) {
            Integer test = i;
            if(check.contains(test) == false)
                return count;
            count++;
        }
        return count;
    }
    else
        return 0;
}
}
