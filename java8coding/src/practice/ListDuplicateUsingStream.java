package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListDuplicateUsingStream {

	public static void main(String[] args) {
	      System.out.println(listDuplicates(Arrays.asList(1,2,4,5,2,7,8,1,9,2,4,3,1,5)));
		
		//System.out.println(listDuplicateUsingFilterAndSetAdd(Arrays.asList(1,2,4,5,2,7,8,1,9,2,4,3,1,5)));
	}
	
	private static Set<Integer> listDuplicates(List<Integer> numbers){
		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		
		return numbers.stream().filter(number ->!uniqueNumbers.add(number)).collect(Collectors.toSet());
	}
	
	
	
	static List<Integer> listDuplicateUsingFilterAndSetAdd(List<Integer> list) {
	    Set<Integer> elements = new HashSet<Integer>();
	    return list.stream()
	      .filter(n -> !elements.add(n))
	      .collect(Collectors.toList());
	}
}
