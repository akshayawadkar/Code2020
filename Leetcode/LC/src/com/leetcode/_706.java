package com.leetcode;
public class _706 {
    class Node{
        int key;
        int val;
        Node next;

        public Node(int key, int val){
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }
    class MyHashMap {

        Node[] nodes;

        /** Initialize your data structure here. */
        public MyHashMap() {
            nodes = new Node[1000];
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {

            int idx = getIdx(key);

            if(nodes[idx] == null){
                nodes[idx] = new Node(-1, -1);
            }

            Node prev = getPrev(nodes[idx], key);
            if(prev.next == null){
                prev.next = new Node(key, value);
            }else{
                prev.next.val = value;
            }
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {

            int idx = getIdx(key);

            if(nodes[idx] == null){
                return -1;
            }

            Node prev = getPrev(nodes[idx], key);
            if(prev.next == null){
                return -1;
            }else{
                return prev.next.val;
            }

        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int idx = getIdx(key);

            if(nodes[idx] == null){
                return;
            }

            Node prev = getPrev(nodes[idx], key);
            if(prev.next == null){
                return;
            }
            prev.next = prev.next.next;
        }

        private Node getPrev(Node curr, int key){

            Node prev = null;

            while(curr != null && curr.key != key){
                prev = curr;
                curr = curr.next;

            }
            return prev;
        }

        private int getIdx(int key){
            return Integer.hashCode(key) % nodes.length;
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}
