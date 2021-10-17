class Solution {
    public int maxArea(int[] height) {
        int res=0;
        for(int i=0,j=height.length-1; i<j; )
        {
            if(height[i]<=height[j])
            {
                res = Math.max(res, height[i]*(j-i));
                i++;
            }
            else
            {
                res = Math.max(res, height[j]*(j-i));
                j--;
            }
        }

        return res;
        
    }
}