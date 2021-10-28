class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] a=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int st=queries[i][0];
            int end=queries[i][1];
            int idx1=queries.length;
            int idx2=0;
            for(int j=st;j<=end;j++)
            {
                if(s.charAt(j)=='|')
                {
                    idx1=j;
                    break;
                }
            }
            for(int j=end;j>=st;j--)
            {
                if(s.charAt(j)=='|')
                {
                    idx2=j;
                    break;
                }
            }
            int c=0;
            for(int j=idx1;j<=idx2;j++)
            {
                if(s.charAt(j)=='*')
                {
                    c++;
                }
            }
            a[i]=c;
        }
        return a;
       
    }
}