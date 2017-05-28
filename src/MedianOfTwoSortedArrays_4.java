//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//Example 1:
//
//nums1 = [1, 3]
//nums2 = [2]
//
//The median is 2.0
//
//Example 2:
//
//nums1 = [1, 2]
//nums2 = [3, 4]
//
//The median is (2 + 3)/2 = 2.5

public class MedianOfTwoSortedArrays_4 {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     
     
     
     
     boolean odd = false;
     if(nums1.length == 0 && nums2.length == 0)
         return 0;
     else if(nums1.length == 0) {
         if(nums2.length%2 > 0)
             odd = true;
         
         Arrays.sort(nums2);
         
         if(odd == true)
             return nums2[(nums2.length-1)/2];
         else
             return (nums2[nums2.length/2]+nums2[nums2.length/2-1])/2.0;
             
     } else if(nums2.length == 0) {
         if(nums1.length%2 > 0)
             odd = true;
         
         Arrays.sort(nums1);
         
         if(odd == true)
             return nums1[(nums1.length-1)/2];
         else
             return (nums1[nums1.length/2]+nums1[nums1.length/2-1])/2.0;
         
     }
     else {
         int len = nums1.length+nums2.length;
         
         if(len%2 > 0)
             odd = true;
             
         int[] combo = new int[len];
         
         for(int i=0; i<nums1.length; i++) {
             combo[i] = nums1[i];
         }
         
         for(int i=0; i<nums2.length; i++) {
             combo[nums1.length+i] = nums2[i];
         }
         
         Arrays.sort(combo);
         System.out.println(combo[(combo.length-1)/2+1]);
         if(odd == true)
             return combo[(combo.length-1)/2];
         else
             return (combo[(combo.length)/2]+combo[(combo.length)/2-1])/2.0;
     }
 }
}
