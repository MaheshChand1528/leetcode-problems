import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        ArrayList<String> arr=getKPC(str);
        System.out.print(arr);

    }
    static String[] key={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> b=new ArrayList<>();
            b.add("");
            return b;
        }
        int c=Character.getNumericValue(str.charAt(0));
        String ros=str.substring(1);
        String keyp=key[c];
        ArrayList<String> arr=getKPC(ros);
        ArrayList<String> myal=new ArrayList<>();
        for(int i=0;i<keyp.length();i++)
        {
            char ch=keyp.charAt(i);
            for(String s:arr)
            {
                myal.add(ch+s);
            }
        }
        return myal;
       
       
    }

}