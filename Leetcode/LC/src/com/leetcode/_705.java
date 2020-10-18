package com.leetcode;
public class _705 {
    class Node{
        int key;
        Node next;

        public Node(int key){
            this.key = key;
            this.next = null;
        }
    }

    class MyHashSet {


        Node[] nodes;

        /** Initialize your data structure here. */
        public MyHashSet() {
            nodes = new Node[1000];
        }

        public void add(int key) {

            int idx = getIdx(key);
            if(nodes[idx] == null){
                nodes[idx] = new Node(-1);
            }
            Node prev = findPrev(nodes[idx], key);
            if(prev.next == null){
                prev.next = new Node(key);
            }else{
                prev.next.key = key;
            }
        }

        public void remove(int key) {
            int idx = getIdx(key);
            if(nodes[idx] == null){
                return;
            }
            Node prev = findPrev(nodes[idx], key);
            if(prev.next == null){
                return;
            }else{
                prev.next = prev.next.next;
            }
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {

            int idx = getIdx(key);
            if(nodes[idx] == null){
                return false;
            }
            Node prev = findPrev(nodes[idx], key);
            if(prev.next == null){
                return false;
            }else{
                return prev.next.key == key;
            }
        }

        private Node findPrev(Node curr, int key){

            Node prev = null;
            while(curr != null && key != curr.key){
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
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
