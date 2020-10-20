package com.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Test{


    public static void main(String[] args) {

       
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
    	
    	pq.add(1);
    	pq.add(12);
    	pq.add(22);
    	pq.add(19);
    	pq.add(3);
    	
//    	System.out.println(pq.poll());
//    	System.out.println(pq.poll());
//    	System.out.println(pq.poll());
//    	System.out.println(pq.poll());
//    	System.out.println(pq.poll());
    	
    	
    	List<Integer> result = new ArrayList<>(pq);
    	
    	System.out.println(result);
    			

    }
}