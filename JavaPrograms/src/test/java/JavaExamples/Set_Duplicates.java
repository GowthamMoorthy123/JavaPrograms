package JavaExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.next();
		name= name.replace(" ", "");
		name = name.trim();
		name = name.strip();

		// To convert in to char array

		char[] chars = name.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for (Character c : chars) {
			list.add(c);
		}

		// Put all list in set to remove duplicates
		HashSet<Character> set = new HashSet<Character>(list);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

	}

}
