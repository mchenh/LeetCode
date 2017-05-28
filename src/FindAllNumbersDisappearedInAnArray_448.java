//Given an array of integers where 1 ¡Ü a[i] ¡Ü n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements of [1, n] inclusive that do not appear in this array.
//
//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
//Example:
//
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[5,6]

public class FindAllNumbersDisappearedInAnArray_448 {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    ArrayList<Integer> insert = new ArrayList<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    for(int i=0; i<nums.length; i++)
        insert.add(i+1);
        
    HashSet work = new HashSet(insert);
    
    for(int i=0; i<nums.length; i++)
        work.remove((Integer)nums[i]);
    
    Iterator<Integer> iter = work.iterator();
    
    while(iter.hasNext()){
        result.add(iter.next());
    }
    
    return result;
}
}
