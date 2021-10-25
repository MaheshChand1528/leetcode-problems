import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=s.nextInt();
        int col=s.nextInt();
        int[][] chess=new int[n][n];
        printKnightsTour(chess,row,col,1);
       
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int m) {
        if(r<0 || r>=chess.length || c<0 || c>=chess.length || chess[r][c]!=0)
        {
            return;
        }
        if(m==chess.length*chess.length)
        {
            chess[r][c]=m;
            displayBoard(chess);
            chess[r][c]=0;
            return;
        }
        if(r<0 || r>=chess.length || c<0 || c>=chess[0].length)
        {
            return;
        }
        chess[r][c]=m;
        printKnightsTour(chess,r-2,c+1,m+1);
        printKnightsTour(chess,r-1,c+2,m+1);
        printKnightsTour(chess,r+1,c+2,m+1);
        printKnightsTour(chess,r+2,c+1,m+1);
        printKnightsTour(chess,r+2,c-1,m+1);
        printKnightsTour(chess,r+1,c-2,m+1);
        printKnightsTour(chess,r-1,c-2,m+1);
        printKnightsTour(chess,r-2,c-1,m+1);
        chess[r][c]=0;
        return;
       
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}