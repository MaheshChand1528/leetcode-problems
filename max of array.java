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
        System.out.print(maxOfArray(a,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length)
        {
            return Integer.MIN_VALUE;
        }
        int max=maxOfArray(arr,idx+1);
        max=Math.max(max,arr[idx]);
        return max;
    }

}
