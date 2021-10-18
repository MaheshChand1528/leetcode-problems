class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int k=1;
        int a=nums[0];
        int l=nums.length;
        int i=1;
        while(i<l)
        {
            if(nums[i]!=a)
            {
                k++;
                a=nums[i];
                i++;
            }
            else
            {
                for(int j=i;j<l-1;j++)
                {
                    nums[j]=nums[j+1];
                }
                l--;
            }
        }
        return k;
    }
}