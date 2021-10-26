import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner s=new Scanner(System.in);
            int m=s.nextInt();
            int n=s.nextInt();
            printMazePaths(1,1,m,n,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
            if(sr==dr && sc==dc)
            {
                System.out.println(psf);
                return;
            }
            if(sc>dc || sr>dr)
            {
                return;
            }
            for(int i=1;i<=dc-sc;i++)
            {
                printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
            }
            for(int i=1;i<=dr-sr;i++)
            {
                printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
            }
            for(int i=1;i<=Math.min(dr-sr,dc-sc);i++)
            {
                printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+i);
            }
            return;
    }

}