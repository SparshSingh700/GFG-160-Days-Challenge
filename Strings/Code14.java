// GFG Implement Atoi
class Solution {
    public int myAtoi(String s) {
        // Your code here
        int l=s.length();
        int i=0;
        int sign=1;
        
        //remove white spaces
        while(i<l && s.charAt(i)==' ') i++;
        
        if(i==l) return 0;
        //check for sign
        if(s.charAt(i)=='+'|| s.charAt(i)=='-'){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        int result=0;
        while(i<l && Character.isDigit(s.charAt(i))){
            int dig=s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-dig)/10)
            { 
                return (sign==1)? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            result=result*10+dig;
            i++;
        }
        return sign*result;
    }
}
