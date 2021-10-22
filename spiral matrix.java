class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<Integer>();
        int n=matrix.length * matrix[0].length;
        int cmin=0;
        int cmax=matrix[0].length-1;
        int rmin=0;
        int rmax=matrix.length-1;
        while(a.size()!=n)
        {
            for(int j=cmin;j<=cmax && a.size()!=n;j++)
            {
                a.add(matrix[rmin][j]);
            }
            rmin++;
            for(int j=rmin;j<=rmax && a.size()!=n;j++)
            {
                a.add(matrix[j][cmax]);
            }
            cmax--;
            for(int j=cmax;j>=cmin && a.size()!=n;j--)
            {
                a.add(matrix[rmax][j]);
            }
            rmax--;
            for(int j=rmax;j>=rmin && a.size()!=n;j--)
            {
                a.add(matrix[j][cmin]);
            }
            cmin++;
        }
        return a;
        
    }
}