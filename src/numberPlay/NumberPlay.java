package numberPlay;

import java.util.*;
import java.util.stream.Collectors;

public class NumberPlay {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args) {
		List<Integer> numbers=new ArrayList<>();
		System.out.print("Enter the number of elements :");
		int n=in.nextInt();
		System.out.print("Enter the elements :");
		for(int i=0;i<n;i++) {
			numbers.add(in.nextInt());
		}
		
		Double minEven=numbers.stream().map(Integer::doubleValue).filter(e -> e%2==0).min(Comparator.comparingDouble(Double::doubleValue)).orElse(null);
		System.out.println(minEven);
		Double maxEven=numbers.stream().map(Integer::doubleValue).filter(e -> e%2==0).max(Comparator.comparingDouble(Double::doubleValue)).orElse(null);
		System.out.println(maxEven);
	}
}
