import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int x=s.nextInt();
        System.out.print(firstIndex(a,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length)
        {
            return -1;
        }
        if(arr[idx]==x)
        {
            return idx;
        }
        int r=firstIndex(arr,idx+1,x);
        return r;
    }

}