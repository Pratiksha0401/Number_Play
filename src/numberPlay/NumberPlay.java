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
		
		Double sumOfNumbers=numbers.stream().map(Integer::doubleValue).reduce((double) 0, Double::sum);
		System.out.println("Sum of numbers : " +sumOfNumbers);
		long count=numbers.stream().count();
		System.out.println("Average of Numbers : " +sumOfNumbers/count);
	}
}
