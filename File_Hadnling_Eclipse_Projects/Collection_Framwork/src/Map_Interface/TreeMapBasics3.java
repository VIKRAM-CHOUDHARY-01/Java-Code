package Map_Interface;

import java.util.TreeMap;

public class TreeMapBasics3 {
public static void main(String[] args) {
	TreeMap<Integer, Integer> map = new TreeMap<>();
	map.put(1, 100);
	map.put(3, 300);
	map.put(5, 500);
	map.put(2, 200);
	map.put(4, 400);
	
	System.out.println(map.ceilingKey(6));
	System.out.println(map.ceilingKey(0));
	System.out.println(map.floorKey(6));
	System.out.println(map.lowerKey(3));
	System.out.println(map.higherKey(4));
	System.out.println(map.firstKey());
	System.out.println(map.lastKey());
	System.out.println(map.pollFirstEntry());
	System.out.println(map.pollLastEntry());
	System.out.println(map);
	System.out.println(map.descendingKeySet());
	System.out.println(map.descendingMap());
	map.put(1, 100);
	map.put(5, 500);
	System.out.println(map.headMap(3));
	System.out.println(map.tailMap(3));
	System.out.println(map.subMap(3, 5));
	
	
}
}
