package com.revature.day5.defaults;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysList {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			a1.add(i);
		}
		System.out.println(a1);
		Stream<Integer> stream = a1.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
                                               .collect(Collectors.toList());
        System.out.print(evenNumbersList);
		
		/*for(Integer ele : a1) {
			if(ele%2 == 0) {
				a2.add(ele);
			}
		}
		System.out.println(a2);*/
	}
		
	}
	
