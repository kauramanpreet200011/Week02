package com.revature.day4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptionExample {

	public static void main(String[] args) {
		File file=new File("D:\\myfile.txt");
		try {
			FileInputStream input = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
