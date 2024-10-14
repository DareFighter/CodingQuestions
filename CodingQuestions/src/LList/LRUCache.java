package LList;

import java.util.*;

public class LRUCache {

    private Deque<Character> _queue;
    private HashMap<Character, Cache> _hashMap;
    private int _cache_capacity;

    public LRUCache(int cache_capacity ){
        _cache_capacity = cache_capacity;
        _queue = new LinkedList<>();
        _hashMap = new HashMap<>();
    }


    public void add(char key, int value){
        if(_hashMap.containsKey(key)){
            Cache curr = _hashMap.get(key);
            _queue.remove(curr.key);
        }
        else{
            if(_queue.size() == _cache_capacity){
                char temp = _queue.removeLast();
                _hashMap.remove(temp);
            }
        }

        Cache newItem = new Cache(key,value);
        _queue.addFirst(newItem.key);
        _hashMap.put(key,newItem);
    }


    public int get(char key){
        if(_hashMap.containsKey(key)){
            Cache current = _hashMap.get(key);
            _queue.remove(current.key);
            _queue.addFirst(current.key);
            return current.value;
        }

        return -1;
    }
}
