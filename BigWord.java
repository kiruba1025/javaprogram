package com.ebrain.demo;

import java.util.Scanner;

public class BigWord {
	public static void main(String[] args) {
	
		System.out.println("list of elements");
		int n;
		Scanner value = new Scanner(System.in);
		
		int data = value.nextInt();
		int oddCount=0;
		int evanCount=0;
		System.out.println("list of number");
		
		for (int i = 0; i < data; i++) {
			n = value.nextInt();

			if (n % 2 != 0) {
				System.out.println("list of odd number:" + n);
				oddCount++;				
			} else {
				System.out.println("list of evan number:" + n);
				evanCount++;
			}
		}
			System.out.println("list of odd count:" + oddCount);
			System.out.println("list of evan count:" + evanCount);
		}
	}


//	System.out.println("list of even number" );
//	for (int i=1;i<=data;i++)
//	{
//		if (i%2==0)
//		{
//			System.out.println(i+"");
//		}
//	}
//	System.out.println("list of odd number" );
//
//	for (int j=1;j<=data;j++)
//	{
//		if( j%2!=0)
//		{
//			System.out.println(j+"");
//		}
//	}
//	value.close();
//	}
//	}
//
