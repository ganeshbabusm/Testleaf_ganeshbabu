package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, Cognizant)	
		
		List<String> Companies = new ArrayList<String>();
		Companies.add("HCL");
		Companies.add("Wipro");
		Companies.add("Aspire Systems");
		Companies.add("Cognizant");
				
//		get the length of the array		
		int size = Companies.size();
		System.out.println("Size of the Array is "+size);
		

//		sort the array	
		Collections.sort(Companies);

//		Iterate it in the reverse order
		for (int i = Companies.size()-1; i >=0; i--) {
			System.out.println(Companies.get(i));
			
		}

//		print the array
		
//		Required Output: Wipro, HCL , CTS, Aspire Systems

	}

}

/* This is working as expected */