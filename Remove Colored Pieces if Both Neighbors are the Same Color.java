class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0;
        int b=0;
        for(int i=1;i<colors.length()-1;i++)
        {
                if(colors.charAt(i)=='A')
                {
                    if(colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A')
                    {
                        a++;
                    }
                
                }
                if(colors.charAt(i)=='B')
                {
                    if(colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B')
                    {
                        b++;
                    }
                
                }
        }
        if(a>b)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}