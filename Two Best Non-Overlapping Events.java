class Solution {
    public int maxTwoEvents(int[][] events) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<events.length;i++)
        {
            int st1=events[i][0];
            int et1=events[i][1];
            int v1=events[i][2];
            max=Math.max(max,events[i][2]);
            for(int j=i+1;j<events.length;j++)
            {
       
                    int st2=events[j][0];
                    int et2=events[j][1];
                    int v2=events[j][2];
                    if(st2<=et1 && st1<=et2)
                    {
                       
                    }
                    else
                    {
                        int s=v1+v2;
                        max=Math.max(max,s);
                    }
               
            }
        }
        return max;
       
    }
}
