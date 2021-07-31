package com.revature.day5.lambdas;

public class SingleParameterLambda {
	public static void main(String[] args) {
		/*SaySomething s1 = (name) ->{ return "Hello "+name;};
		System.out.println(s1.sayName("Aman"));
		
		SaySomething s2 = name -> "Hello "+name;;
		System.out.println(s2.sayName("preet"));*/
		
		SaySomething saySomething=(fName, lastName,middleName) -> { return   "Hello, "+fName+" "+lastName+" "+middleName; };
        System.out.println(saySomething.sayFullName("Jasdhir","Singh","Middle"));
        
       /* SaySomething saySomething=(fName, lastName,middleName) -> { return   "Hello, "+fName+" "+lastName+" "+middleName; };
        System.out.println(saySomething.sayFullName("Jasdhir","Singh","Middle"));*/
       
       


	}

}
