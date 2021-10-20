import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        printKPC(str,"");

    }
    static String[] key={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        char c1=str.charAt(0);
        String s=str.substring(1);
        String s1=key[c1-'0'];
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            printKPC(s,asf+c);
        }
        return;
    }

}
