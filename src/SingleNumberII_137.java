// Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
//
//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
public class SingleNumberII_137 {
  public int singleNumber(int[] nums) {
    if(nums.length == 0)
        return -1;
    else if(nums.length == 1)
        return nums[0];
    else {
        Arrays.sort(nums);
        
        int result = nums[0];
        int count = 1;
        
        for(int i = 1; i<nums.length; i++) {
            
            System.out.println("Result: " + result + "\nCount: " +count+"\n");
            
            if(result == nums[i] && count == 3) {
                System.out.println("Error");
            }
            else if(result != nums[i]) {
                if(count == 1)
                    return result;
                else {
                    result = nums[i];
                    count = 1;
                }
            }
            else if(result == nums[i])
                count++;
            else
                continue;
        }
        return result;
    }
}
}
