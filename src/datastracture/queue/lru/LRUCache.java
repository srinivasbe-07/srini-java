package datastracture.queue.lru;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


class CacheEntry{
	private int key;
	private String value;
	public CacheEntry(int key, String value) {
		this.key = key;
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
}
public class LRUCache{
	
	private int size;
	private Map<Integer, CacheEntry> map;
	private LinkedList<CacheEntry> cache;
	public LRUCache(int size) {
		
		this.size = size;
		map = new HashMap<Integer, CacheEntry>();
	    cache = new LinkedList<CacheEntry>();
	}
	
	public String getFromCache(int key) {
		String value = "";
		if(map.containsKey(key)) {
			cache.remove(map.get(key));
			cache.addLast(cache.get(key));
			value= map.get(key).getValue();
		}
		return value;
		
	}
	
	public void setToCache(int key,  String value) {
		
		CacheEntry cacheEntry = new CacheEntry(key, value);
		if(map.containsKey(key)) {
			cache.remove(cacheEntry);
		}
		else {
			if(cache.size() >= size) {
				cache.removeFirst();
				map.put(key, cacheEntry);
			}
			
		}

		cache.addLast(cacheEntry);
	}
	
	public void printcache() {
		
	System.out.println();
	  cache.forEach((ch)->{
		  System.out.print("[ " + ch.getKey() + ", " + ch.getValue() + " ]");
	  });
	}
	
	public static void main(String[] args) {
		LRUCache lruCache = new LRUCache(4);
		lruCache.setToCache(1, "1");
		lruCache.printcache();
		lruCache.setToCache(2, "2");
		lruCache.printcache();

		lruCache.setToCache(3, "3");
		lruCache.printcache();

		lruCache.setToCache(4, "4");
		lruCache.printcache();

		lruCache.setToCache(5, "5");
		lruCache.printcache();

		lruCache.setToCache(2, "2");
		lruCache.printcache();
		lruCache.setToCache(6,"6");
		lruCache.printcache();

	}
}