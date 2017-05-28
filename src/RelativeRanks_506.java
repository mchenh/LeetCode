/*
 *  Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:

Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.

Note:

    N is a positive integer and won't exceed 10,000.
    All the scores of athletes are guaranteed to be unique.

 */
public class RelativeRanks_506 {
  public String[] findRelativeRanks(int[] nums) {
    String[] result = new String[nums.length];
    
    for(int i=0; i<nums.length; i++)
    {
        int temp = nums[i];
        int rank = 1;
        for(int j=0; j<nums.length; j++)
        {
            if(i != j) {
                if(nums[i] < nums[j])
                    rank++;
            }
        }
        
        if(rank == 1)
            result[i] = "Gold Medal";
        else if(rank == 2)
            result[i] = "Silver Medal";
        else if(rank == 3)
            result[i] = "Bronze Medal";
        else {
            Integer numRank = rank;
            result[i] = numRank.toString();
        }
    }
    
    return result;
}
}
