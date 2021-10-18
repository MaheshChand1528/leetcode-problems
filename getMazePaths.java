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
        if(sr==dc && sc==dr)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        if(sr>dc || sc>dr)
        {
            ArrayList<String> a=new ArrayList<>();
            return a;
        }
        ArrayList<String> a=getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> b=getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> myal=new ArrayList<>();
        for(String s:a)
        {
            myal.add("h"+s);
        }
        for(String s:b)
        {
            myal.add("v"+s);
        }
        return myal;
    }

}
