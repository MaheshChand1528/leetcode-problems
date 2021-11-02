class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a=new int[n][n];
        int rmin=0;
        int cmin=0;
        int rmax=n-1;
        int cmax=n-1;
        int i=1;
        int l=n*n;
        while(i!=l+1)
        {
            for(int j=cmin;j<=cmax && i!=l+1;j++)
            {
                a[rmin][j]=i;
                i++;
            }
            rmin++;
            for(int j=rmin;j<=rmax && i!=l+1;j++)
            {
                a[j][cmax]=i;
                i++;
            }
            cmax--;
            for(int j=cmax;j>=cmin && i!=l+1;j--)
            {
                a[rmax][j]=i;
                i++;
            }
            rmax--;
            for(int j=rmax;j>=rmin && i!=l+1;j--)
            {
                a[j][cmin]=i;
                i++;
            }
            cmin++;
        }
        return a;
    }
}