class Solution {
    public String convert(String s, int rows) {
        
        int len=s.length(),j=0,downJump=0,upJump=0,counter=0;
        if(len<=rows || rows<=1)
            return s;
        char[] a=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        boolean isDownJump=true;
        for(int i=0;i<rows;i++){
            j=i;
            downJump=(rows-1-i)+(rows-1-i-1);// (2rows -2i-3)
            upJump=2*i-1; // (i-1 + i)
			// Scenarios for first row and last row.
            if(i==0)
                upJump=downJump;
            if(i==rows-1)
                downJump=upJump;
            isDownJump=true;
            while(j<len){ 
			// if we have read N character, break the loop;
                if(counter==len)
                    break;
                sb.append(a[j]);
                if(isDownJump)
                j+=downJump+1;
                else
                    j+=upJump+1;
                counter++;
				// Change the Direction after each Jump for Zig zag.
               isDownJump= isDownJump?false:true;
            }
            
            
        }
        return sb.toString();
    }
}