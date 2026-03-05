class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            merged[k] = nums1[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            merged[k] = nums2[i];
            k++;
        }
        Arrays.sort(merged);
        int total = merged.length;
        int start = 0;
        int end = merged.length - 1;
        if (total % 2 == 0) {
            int mid1=total/2;
            int mid2=mid1-1;
            return ((double) merged[mid1] + (double) merged[mid2]) / 2.0;

        } else {
            
            return (double) merged[total/2];
        }
    }
}
