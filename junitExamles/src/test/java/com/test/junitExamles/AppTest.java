package com.test.junitExamles;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitExamles.Calculator;

public class AppTest {
	@AfterEach
	void afterEach() {
		System.out.println("after each");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("after all");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before each");
	}
	
	@BeforeAll
	 static void beforeAll() {
		System.out.println("before all");
	}
	
	@Test
	void testOne() {
		 System.out.println("======TEST ONE EXECUTED=======");
		 Assertions.assertEquals( 4 , Calculator.add(2, 2));
	}
	

	@Test
	void testTwo() {
		 System.out.println("======TEST ONE EXECUTED=======");
		 Assertions.assertEquals( 4 , Calculator.add(2, 2));
	}

}
