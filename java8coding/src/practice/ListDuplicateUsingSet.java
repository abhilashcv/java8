package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicateUsingSet {

	public static void main(String[] args) {
		List<Integer> integerNumbers = Arrays.asList(1, 2, 3, 6, 4, 2, 7, 11, 3, 7);
		System.out.println(listDuplicateUsingSet(integerNumbers));
	}

	/**
	 * 
	 * @param NumberList
	 * @return DuplicateNumbers
	 * 
	 */
	private static List<Integer> listDuplicateUsingSet(List<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> duplicates = new ArrayList<Integer>();
		for (Integer integer : list) {
			if (set.contains(integer)) {
				duplicates.add(integer);
			} else {
				set.add(integer);
			}
		}
		return duplicates;
	}
}
