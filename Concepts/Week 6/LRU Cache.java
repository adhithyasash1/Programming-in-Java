/*
LinkedHashMap in AccessOrder. 
It will move the latest accessed element to the front which only incurs O(1) overhead 
because the underlying elements are organized in a doubly-linked list while also are 
indexed by hash function. So the get/put/top_newest_one operations all cost O(1).
*/

class LRUCache extends LinkedHashMap<Integer, Integer>{
    private int maxSize;
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.maxSize = capacity;
    }

    //return -1 if miss
    public int get(int key) {
        Integer v = super.get(key);
        return v == null ? -1 : v;
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return this.size() > maxSize; //must override it if used in a fixed cache
    }
}













/*
LinkedHashMap to implement LRU cache
*/

public class LRUCache {
    private class Node{
        int key, value;
        Node prev, next;
        Node(int k, int v){
            this.key = k;
            this.value = v;
        }
        Node(){
            this(0, 0);
        }
    }
    private int capacity, count;
    private Map<Integer, Node> map;
    private Node head, tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node n = map.get(key);
        if(null==n){
            return -1;
        }
        update(n);
        return n.value;
    }
    
    public void set(int key, int value) {
        Node n = map.get(key);
        if(null==n){
            n = new Node(key, value);
            map.put(key, n);
            add(n);
            ++count;
        }
        else{
            n.value = value;
            update(n);
        }
        if(count>capacity){
            Node toDel = tail.prev;
            remove(toDel);
            map.remove(toDel.key);
            --count;
        }
    }
    
    private void update(Node node){
        remove(node);
        add(node);
    }
    private void add(Node node){
        Node after = head.next;
        head.next = node;
        node.prev = head;
        node.next = after;
        after.prev = node;
    }
    
    private void remove(Node node){
        Node before = node.prev, after = node.next;
        before.next = after;
        after.prev = before;
    }
}

















/*
Another Implementation
*/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    private int size;
    private Map<Integer, Data> cache;
    private LinkedList<Data> dataList;
    public LRUCache(int size) {
        super();
        this.size = size;
        this.cache = new HashMap<>();
        this.dataList = new LinkedList<>();

    }
    public String get(int key) {
        if (cache.containsKey(key)) {
            Data data = cache.get(key);
            // Remove the data from its location
            dataList.remove(data);
            // Add it to the end of the list
            dataList.add(data);
            return data.getValue();
        }
        return "NA";
    }
    public void set(int key, String value) {
        if (cache.containsKey(key)) {
            Data oldData = cache.get(key);
            // Remove old data from linkedlist
            dataList.remove(oldData);
            Data newData = new Data(key, value);
            // Update the value
            cache.put(key, newData);
            // Add new data at the end of the linkedlist
            dataList.add(newData);
        } else {
            Data data = new Data(key, value);
            if (cache.size() >= size) {
                // Remove the oldest value from both map and linkedlist
                cache.remove(dataList.pollFirst().getKey());
            }
            cache.put(key, data);
            dataList.add(data);
        }
    }
}















/*
Another
*/

class LRUCache {
    int capacity;
    Map<Integer, ListNode> map;
    ListNode head, tail;
    private static class ListNode {
        int key, value;
        ListNode prev, next;
        
        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        ListNode node = map.get(key);
        if(node == null) return -1;
        
        if(node != head){
            removeFromLinkedList(node);
            insertToFrontOfLinkedList(node);
        }
        
        return node.value;
    }
    
    public void put(int key, int value) {
        removeFromCache(key);
        if(map.size() >= capacity && tail != null)
            removeFromCache(tail.key);
        
        ListNode node = new ListNode(key, value);
        insertToFrontOfLinkedList(node);
        map.put(key, node);
    }
    
    void removeFromCache(int key) {
        removeFromLinkedList(map.get(key));
        map.remove(key);
    }
    
    void removeFromLinkedList(ListNode node) {
        if(node == null)  return;
        
        if(node.prev != null) node.prev.next = node.next;
        if(node.next != null) node.next.prev = node.prev;
        
        if(node == tail) tail = node.prev;
        if(node == head) head = node.next;
    }
    
    void insertToFrontOfLinkedList(ListNode node) {
        if(head == null) {
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;           
            head = node;
        }
    }
}



















/*
LeetCode
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU Cache
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

 get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 put(key, value) - Set or insert the value if the key is not already present.
 When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

 Follow up:
 Could you do both operations in O(1) time complexity?

 Example:

 LRUCache cache = new LRUCache(2);//capacity

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4
        */

public class _146 {

    public class Solution1 {
        public class LRUCache {
            /**
             * The shortest implementation is to use LinkedHashMap:
             * specify a size of the LinkedHashMap;
             * override the removeEldestEntry method when its size exceeds max size:
             * https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#removeEldestEntry-java.util.Map.Entry-
             * in the constructor, set the last boolean variable to be true: it means the ordering mode,
             * if we set it to be true, it means in access order, false, means it's in insertion order:
             * https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#LinkedHashMap-int-float-boolean-
             */

            private Map<Integer, Integer> cache;
            private final int max;

            public LRUCache(int capacity) {
                max = capacity;
                cache = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true) {
                    public boolean removeEldestEntry(Map.Entry eldest) {
                        return cache.size() > max;
                    }
                };
            }

            public int get(int key) {
                return cache.getOrDefault(key, -1);
            }

            public void put(int key, int value) {
                cache.put(key, value);
            }
        }
    }

    public class Solution2 {
        public class LRUCache {
            /**
             * The more verbose solution is to write a doubly linked list plus a map.
             */
            private class Node {
                int key;
                int value;

                LRUCache.Node prev;
                LRUCache.Node next;

                Node(int k, int v) {
                    this.key = k;
                    this.value = v;
                }

                Node() {
                    this.key = 0;
                    this.value = 0;
                }
            }

            private int capacity;
            private int count;
            private LRUCache.Node head;
            private LRUCache.Node tail;
            private Map<Integer, LRUCache.Node> map;
            // ATTN: the value should be Node type! This is the whole point of having a class called Node!

            public LRUCache(int capacity) {
                this.capacity = capacity;
                this.count = 0;// we need a count to keep track of the number of elements in the cache so
                // that we know when to evict the LRU one from the cache
                this.map = new HashMap();
                head = new LRUCache.Node();
                tail = new LRUCache.Node();
                head.next = tail;
                tail.prev = head;
            }

            public int get(int key) {
                LRUCache.Node node = map.get(key);
                // HashMap allows value to be null, this is superior than HashTable!
                if (node == null) {
                    return -1;
                } else {

                    /**Do two operations: this makes the process more clear:
                     * remove the old node first, and then
                     * just add the node again.
                     * This will guarantee that this node will be at the latest position:
                     * the most recently used position.*/
                    remove(node);
                    add(node);

                    return node.value;
                }
            }

            public void put(int key, int value) {
                LRUCache.Node node = map.get(key);
                if (node == null) {
                    node = new LRUCache.Node(key, value);
                    map.put(key, node);
                    add(node);
                    count++;

                    if (count > capacity) {
                        /** ATTN: It's tail.prev, not tail, because tail is always an invalid node, it
                         doesn't contain anything, it's always the tail.prev that is the last node in the
                         cache*/
                        LRUCache.Node toDelete = tail.prev;
                        map.remove(toDelete.key);
                        remove(toDelete);
                        count--;
                    }
                } else {
                    remove(node);
                    node.value = value;
                    add(node);
                }
            }

            private void remove(LRUCache.Node node) {
                LRUCache.Node next = node.next;
                LRUCache.Node prev = node.prev;
                prev.next = next;
                next.prev = prev;
            }

            private void add(LRUCache.Node node) {
                // ATTN: we'll always add the node into the first position: head.next!!!!
                LRUCache.Node next = head.next;
                head.next = node;
                node.next = next;
                node.prev = head;
                next.prev = node;
            }
        }
    }
}

