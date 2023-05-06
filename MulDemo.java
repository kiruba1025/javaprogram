package com.ebrain.demo;

public class MulDemo {
		public static void main (String[] args)
	{
		int x=5;
		int y=6;
		int z=(x*y); // this multiplication -arithmetic operator
		int e=5;
		int f=6;
		int c= e%f;  // this modulus
		int a=10;
		int b=3;  // this division
		int s=5;
		s &=3; //this assignment operator
		float g=52.0f;
		float h=53.0f;// this comparison operator
		int i=25;
		int j=35;// this logical operator
	
		System.out.println(z + "multiplication");
		System.out.println(a/b +"modulus");
		System.out.println(s);
		System.out.println(c);
		System.out.println(g>=h);
		System.out.println(i<30||j<20);
	}
}
