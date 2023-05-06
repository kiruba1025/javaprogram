package com.ebrain.demo;
import java.util.Scanner;
public class OperScan 
{
	public static void main (String[] args)
	{
  Scanner value =new Scanner(System.in);
  System.out.println("enter the value x: ");
  int sc1 = value.nextInt();
  System.out.println("enter the value y:");
  int sc2 = value.nextInt();
  System.out.println("enter the value z");
  int sc3 = value.nextInt();
  System.out.println( sc1 + sc2 +sc3);
  value.close();
}
}

