package com.collections.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		//HashSet frds = new HashSet<>();
		
		TreeSet frds = new TreeSet();
		//ArrayList <String>frds=new ArrayList();
		//HashMap <String,Double> frds=new HashMap<String,Double>();
	    //TreeMap<String,Double> frds=new TreeMap<String,Double>();
		frds.add("Aman");
		frds.add("preet");
		frds.add("akshay");
		frds.add("astha");
		frds.add("Abhi");
		
		System.out.println(frds);
		
		Iterator frdsItr = frds.iterator();
		while(frdsItr.hasNext()) {
			System.out.println(frdsItr.next());
		}
		
	/*	for(String s:frds)
		{
			System.out.println(s);
		}*/
	}

}
