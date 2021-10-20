class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ob=new ArrayList<>();
        for(int i=0;i<n-2;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                int sum=0-nums[i];
                int si=i+1;
                int ei=n-1;
               
               
                while(si<ei)
                {
                    List<Integer> subOut=new ArrayList<>();
                    if(nums[si]+nums[ei]==sum)
                    {
                     subOut.add(nums[i]);
                        subOut.add(nums[si]);
                        subOut.add(nums[ei]);
                        ob.add(subOut);
                        while(si<ei && nums[si]==nums[si+1])  si++;
                        while(si<ei && nums[ei]==nums[ei-1])  ei--;
                        si++;ei--;
                    }
                    else if(nums[si]+nums[ei]<sum)
                        si++;
                    else
                        ei--;
                }
            }
        }
        return ob;
       
    }
}