import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<String> a=getStairPaths(n);
        System.out.print(a);
    }

    public static ArrayList<String> getStairPaths(int n)
    {
        if(n<0)
        {
            ArrayList<String> s=new ArrayList<>();
            return s;
        }
        if(n==0)
        {
            ArrayList<String> s=new ArrayList<>();
            s.add("");
            return s;
        }
        ArrayList<String> a=getStairPaths(n-1);
        ArrayList<String> b=getStairPaths(n-2);
        ArrayList<String> c=getStairPaths(n-3);
        ArrayList<String> myal=new ArrayList<>();
        for(String st:a)
        {
            myal.add("1"+st);
        }
        for(String st:b)
        {
            myal.add("2"+st);
        }
        for(String st:c)
        {
            myal.add("3"+st);
        }
        return myal;
    }

}
