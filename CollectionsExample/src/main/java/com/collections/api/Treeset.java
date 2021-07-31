package com.collections.api;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	
	public static void main(String[] args) {
		
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
	}
}
