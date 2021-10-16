import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        ArrayList<String> a=getMazePaths(1,1,m,n);
        System.out.print(a);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        if(sr>dr || sc>dc)
        {
            ArrayList<String> a=new ArrayList<>();
            return a;
        }
        ArrayList<String> myal=new ArrayList<>();
        for(int j=1;j<=dc-sc;j++)
        {
            ArrayList<String> b=getMazePaths(sr,sc+j,dr,dc);
            for(String s:b)
        {
            myal.add("h"+j+s);
        }
        }
        for(int i=1;i<=dr-sr;i++)
        {
            ArrayList<String> a=getMazePaths(sr+i,sc,dr,dc);
            for(String s:a)
        {
            myal.add("v"+i+s);
        }
        }
        for(int i=1;i<=dc-sc;i++)
        {
            ArrayList<String> c=getMazePaths(sr+i,sc+i,dr,dc);
            for(String s:c)
        {
            myal.add("d"+i+s);
        }
        }
        return myal;
    }

}
