package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollect {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		System.out.println(numbers);
		numbers.remove(2);
		System.out.println(numbers);
	}

}

/* This is working as expected */