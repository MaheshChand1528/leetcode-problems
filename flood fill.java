import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] a=new int[arr.length][arr[0].length];
        floodfill(arr, 0, 0, "",a);
    }
   
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,int[][] a) {
        if(sr==maze.length-1 && sc==maze[0].length-1)
        {
            System.out.println(asf);
            return;
        }
        if(sr==maze.length || sc==maze[0].length || sr<0 || sc<0 || a[sr][sc]==1)
        {
            return;
        }
        if(maze[sr][sc]==1)
        {
            a[sr][sc]=1;
            return;
        }
       
            a[sr][sc]=1;
            floodfill(maze,sr-1,sc,asf+"t",a);
            floodfill(maze,sr,sc-1,asf+"l",a);
            floodfill(maze,sr+1,sc,asf+"d",a);
            floodfill(maze,sr,sc+1,asf+"r",a);
            a[sr][sc]=0;
       
        return;
    }
}