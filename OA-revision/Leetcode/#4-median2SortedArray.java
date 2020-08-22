class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        double median = 0.0;
        
        int i = 0, j = 0, k = 0;
        
        //median arr
        int arr[] = new int[x + y];
        int medLen = arr.length;
        
        while(i < x && j < y)// merging nums1 and nums2
            arr[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        while(i < x)
            arr[k++] = nums1[i++];
        while(j < y)
            arr[k++] = nums2[j++];
        if(medLen % 2 == 0)//median is even length after dividing by 2
        {
            median = arr[medLen / 2 - 1] + arr[medLen / 2];
            median = median / 2;
        }else // if median is odd length 
            median = arr[medLen / 2];
        return median;
    }
}