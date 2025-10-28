package Map_Interface;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapBasics {
	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("SingerName", "David Kushner");
		tm.put("Song", "Daylight");
		tm.put("AvailableOn", "YouTube");
		tm.put("Realese In", "2023");
		// keys are automatically sorted -> A-Z
		for(Entry<String, String> et : tm.entrySet()) {
			System.out.println(et.getKey() + "\t" + et.getValue());
		}
	}

}
