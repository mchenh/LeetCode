/*
 *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

 */
public class MoveZeroes_283 {
  public void moveZeroes(int[] nums) {
    boolean moved = true;
    int count = 0;
    while(moved) { 
        moved = false;
        for(int i=0; i<nums.length - count; i++) {
            int move = 0;
            if(nums[i] == move)
            {
                moved = true;
                count++;
                int temp =nums[nums.length-1];
                
                for(int j=nums.length-1; j>=i; j--) {
                    if(j != nums.length-1) {
                         int temp2 = temp;
                         temp = nums[j];
                         nums[j] = temp2;
                    }
                    else {
                        temp = nums[j];
                        nums[j] = 0;
                    }
                    
                   // for(int k=0; k<nums.length; k++)
                        //System.out.print(nums[k]+ ", ");
                    
                   // System.out.println("");
                }
               // System.out.println("One loop finished");
               break;
            }  
        }
    }
}
}
