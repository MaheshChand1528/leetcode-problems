class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length + nums2.length;
        int[] arr=new int[l];
        int j=0;
        for(int i=0;i<l;i++)
        {
            if(i<nums1.length)
            {
                arr[i]=nums1[i];
            }
            else
            {
                arr[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(arr);
        double m=0;
        if(l%2==0)
        {
            m=((float)(arr[l/2-1]+arr[l/2])/2);
            
        }
        else
        {
            m=arr[l/2];
        }
        return m;
        
    }
}