package com.leetcode;

public class _686 {
	
 
	    public int repeatedStringMatch(String a, String b) {
	        
	        StringBuilder sb = new StringBuilder(a);
	        int rep = 1;
	        
	        while(sb.length() < b.length()){
	            sb.append(a);
	            rep++;
	        }
	        
	        if(sb.indexOf(b) >= 0){
	            return rep;
	        }
	        sb.append(a);
	        rep++;
	        
	        if(sb.indexOf(b) >= 0){
	            return rep;
	        }
	        
	        return -1;
	    }
	 

}
