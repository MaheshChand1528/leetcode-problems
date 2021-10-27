import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
        max=Math.max(max,a[i]);
    }
    int t=max;
    for(int i=0;i<t;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(a[j]>=max)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("\t");
            }
        }
        max--;
        System.out.println();
    }
   
 }

}
