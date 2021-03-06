package _02_Strings;

public class _02_Atoi {
	 public int myAtoi(String s) {
	        
	        int i = 0;
	        int n = s.length();
	        while(i < n && s.charAt(i) == ' '){
	            i++;
	        }
	        
	        if(i >= n){
	            return 0;
	        }
	        int sign = 1;
	        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
	            sign = s.charAt(i) == '+' ? 1 : -1;
	            i++;
	        }
	        long result = 0;
	        
	        while(i < n && Character.isDigit(s.charAt(i))){
	             result = (result * 10) + (s.charAt(i) - '0');
	            if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
	                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	            }
	            i++;
	        }
	        
	        
	        return (int)result * sign;
	    }
}

