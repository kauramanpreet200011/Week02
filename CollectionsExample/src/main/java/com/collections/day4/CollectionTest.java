package com.collections.day4;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {
	
	public static void main(String[] args) {
	  ArrayList <String>frds=new ArrayList();
				//HashMap <String,Double> frds=new HashMap<String,Double>();
			    //TreeMap<String,Double> frds=new TreeMap<String,Double>();
				frds.add("Aman");
				frds.add("preet");
				frds.add("akshay");
				frds.add("astha");
				frds.add("Abhi");
				
				System.out.println(frds);
				
				Collections.sort(frds);
				
				System.out.println(frds);
	}

}
