//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//Note:
//You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
public class MergeSortedArray_88 {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
     for(int i=m; i<m+n; i++) {
         nums1[i] = nums2[i-m];
     }
     
     Arrays.sort(nums1);
 }
}
