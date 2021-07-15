package sampleproblems;

public class median {

    static double findMedian(int [] nums1, int [] nums2){
        if(nums1.length < nums2.length) return findMedian(nums2, nums1);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int size = len1 + len2;
        int half = size /2;

    

        int l = 0, r = len1-1;
        while(l <= r){
            int aPartition = (l+r)/2;
            int bPartition = half - aPartition - 2;

            
            int aLeft = aPartition >= 0 ? nums1[aPartition]: Integer.MIN_VALUE;
            int aRight = aPartition+1 < len1? nums1[aPartition+1]:Integer.MAX_VALUE;
            int bLeft = bPartition >= 0 ? nums2[bPartition]: Integer.MIN_VALUE;
            int bRight = bPartition+1 < len2? nums2[bPartition+1]:Integer.MAX_VALUE;

            if (aLeft <= bRight && bLeft <= aRight){
                if(size%2 == 1){
                    return Math.min(aRight,bRight);
                }else{
                    return ((double)Math.max(aLeft,bLeft) + Math.min(aRight,bRight)) / 2;
                }
            }else if(aLeft > bRight){
                r = aPartition-1;
            }else{
                l = aPartition + 1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int[] nums1 = {1,2,3};
        int [] nums2 = {1,2,3,4,5,6,7};
        double res = findMedian(nums1, nums2);
        System.out.print(res);
    }
    // 1 1 2 2 3 3 4 5 6 7
}
