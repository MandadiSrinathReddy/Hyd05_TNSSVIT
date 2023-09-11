package com.svit.daytwo.basics;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=78, b=67, c=79;
		System.out.println("The biggest number is");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (c > b)
				System.out.println(c);
			else
				System.out.println(b);
		}

	

	}

}
