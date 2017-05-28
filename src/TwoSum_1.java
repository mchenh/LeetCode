/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */
public class TwoSum_1 {
  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    int index1=0, index2=0;
    
    ArrayList<Integer> input = new ArrayList<Integer>();
    for(int i=0; i<nums.length; i++)
        input.add(nums[i]);
    
    for(int i=0; i<input.size(); i++) {
        index1 = i;
        int temp = target-input.get(i);
        if(input.indexOf(temp) == -1 || input.indexOf(temp) == index1)
            continue;
        else {
            index2 = input.indexOf(temp);
            System.out.println(temp);
            result[0] = index1;
            result[1] = index2;
            break;
        }
    }
    
    return result;
}
}
