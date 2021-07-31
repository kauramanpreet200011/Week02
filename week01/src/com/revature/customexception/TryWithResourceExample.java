package com.revature.customexception;
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	 

	public class TryWithResourceExample {
	    public static void main(String[] args) {
	        
	        
	        
	        try (FileInputStream file=new FileInputStream("D:\\myfile.txt")){
	            
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
	    }
	}
	