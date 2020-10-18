package com.leetcode;
import java.util.*;
public class _146 {
    class Node{

        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val){
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    class LRUCache {

        int count;
        int capacity;
        Node head, tail;
        Map<Integer, Node> map;

        public LRUCache(int capacity) {
            this.count = 0;
            this.capacity = capacity;
            head = new Node(-1, -1);
            tail = new Node(-1, -1);

            head.next = tail;
            tail.prev = head;

            map = new HashMap<>();

        }

        public int get(int key) {

            Node curr = map.get(key);
            if(curr == null){
                return -1;
            }else{
                remove(curr);
                add(curr);
                return curr.val;
            }

        }

        public void put(int key, int value) {

            Node curr = map.get(key);
            if(curr == null){
                curr = new Node(key, value);
                map.put(key, curr);
                add(curr);
                count++;
                if(count > capacity){
                    Node toDelete = tail.prev;
                    map.remove(toDelete.key);
                    remove(toDelete);
                    count--;
                }
            }else{
                remove(curr);
                curr.val = value;
                add(curr);
            }


        }

        public void remove(Node node){
            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        public void add(Node node){
            Node next = head.next;
            head.next = node;
            node.prev = head;

            node.next = next;
            next.prev = node;
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
