package datastracture.queue.lru;

import java.util.LinkedList;

public class SimpleLRU {
	LinkedList<Integer> linkedList;
	final int CAPACITY = 4;
	public SimpleLRU() {
		this.linkedList = new LinkedList<Integer>();
	}
	
	public void lru(int data) {
		if(linkedList.contains(data)) {
			linkedList.remove(Integer.valueOf(data));
			printCache();
			linkedList.addLast(data);
		}
		else {
			if(linkedList.size() == CAPACITY) {
				linkedList.remove();
			}
			linkedList.addLast(data);
		}
	}
	public void printCache() {
		System.out.println();
		linkedList.forEach(l->System.out.print(l + " "));
	}
	public static void main(String[] args) {
		SimpleLRU simpleLRU = new SimpleLRU();
		simpleLRU.lru(1);
		simpleLRU.printCache();
		simpleLRU.lru(2);
		simpleLRU.printCache();
		simpleLRU.lru(3);
		simpleLRU.printCache();
		simpleLRU.lru(4);
		simpleLRU.printCache();
		simpleLRU.lru(5);
		simpleLRU.printCache();
		simpleLRU.lru(2);
		simpleLRU.printCache();
		
		simpleLRU.lru(6);
		simpleLRU.printCache();
	}
}