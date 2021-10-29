class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        int[] a=new int[n];
        int b=0;
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j && arr[i].equals(arr[j]))
                {
                    c++;
                }
            }
            a[i]=c;
            if(c==1)
            {
                b++;
            }
        }
        if(k<=b)
        {
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==1)
                {
                    c++;
                    if(c==k)
                    {
                        return arr[i];
                    }
                }
            }
        }
        return "";
       
    }
}