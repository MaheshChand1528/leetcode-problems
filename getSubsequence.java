import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        ArrayList<String> arr=gss(s);
        System.out.print(arr);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> arr=new ArrayList<>();
            arr.add("");
            return arr;
        }
        char c=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> arr=gss(ros);
       
        ArrayList<String> myal=new ArrayList<>();
        for(String s:arr)
        {
            myal.add(""+s);
        }
        for(String s:arr)
        {
            myal.add(c+s);
        }
        return myal;
       
    }

}