//Given an array of size n, find the majority element. The majority element is the element that appears more than n/2  times.
//
//You may assume that the array is non-empty and the majority element always exist in the array.
public class MajorityElement_169 {
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    System.out.println(nums.length/2);
    int count = 0;
    int num = nums[0];
    for(int i=0; i<nums.length; i++) {
        
        if(count > nums.length/2)
            return num;
        if(nums[i] == num)
            count++;
        if(nums[i] != num) {
            num = nums[i];
            count = 1;
        }
    }
    
    return num;
}
}
