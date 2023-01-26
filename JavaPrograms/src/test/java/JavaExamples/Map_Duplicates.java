package JavaExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Gowtham Moorthy";
		name = name.replaceAll(" ", "");
		name = name.trim();
		name = name.strip();
		char[] chars = name.toCharArray();
		int number = 1;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : chars) {
			if (map.containsKey(c)) {
				map.put(c, number + 1);

			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

		// To Iterate the map
		/*
		 * Iterator mapit = map.entrySet().iterator(); while (mapit.hasNext()) {
		 * Map.Entry me = (Map.Entry) mapit.next(); System.out.println(me.getKey() +
		 * " : Exist -->" + me.getValue() + " time"); }
		 */

		// To Print only duplicates

		Iterator mapit = map.entrySet().iterator();
		while (mapit.hasNext()) {
			Map.Entry me = (Map.Entry) mapit.next();
			int a =(int) me.getValue();
			if (a > 1) {
				System.out.println(me.getKey() + " : Exist -->" + me.getValue() + " time");
			}
		}

	}

}
