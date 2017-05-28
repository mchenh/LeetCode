//Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct. 
public class ContainsDuplicate_217 {
  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    
    if(nums.length>1) {
    int current = nums[0];
    for(int i=1; i<nums.length; i++) {
        if(nums[i] == current)
            return true;
        else
            current = nums[i];
    }
    
    return false;
    }
    else
        return false;
}
}
