package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class _692 {
	
	 
	    public List<String> topKFrequent(String[] words, int k) {
	        
	        Map<String, Integer> map = new HashMap<>();

	        for(String word : words){
	            map.put(word, map.getOrDefault(word, 0) + 1);    
	        }
	        
	        PriorityQueue<String> pq = new PriorityQueue<>((a, b) ->{
	            if(map.get(a) == map.get(b)){
	                return a.compareTo(b);
	            }
	            return map.get(b) - map.get(a);
	        });
	        
	        pq.addAll(map.keySet());
	        
	        List<String> result = new ArrayList<>();
	        while(k-- > 0){
	            result.add(String.valueOf(pq.poll()));
	        }
	        
	        return result;
	    }
	 

}
