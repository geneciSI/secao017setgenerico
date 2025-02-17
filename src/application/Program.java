package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>(); // mantem a ordem conforme os dados foram inseridos
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Motherboard");
		
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
	}
}
