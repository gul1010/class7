package com.class7;

public class LoopTask {

	public static void main(String[] args) {
		
		int num=1;
		while(num<=100) {
			System.out.print(num+" ");
			num++;
		}
		
		System.out.println("----------------------------------------------------------------------");
		  
		int a=100;
		while(a>=1) {
			System.out.print(a+" ");
			a--;
		}
		
		System.out.println("---------------------------------------------------------------------");
		int b=20;
		while (b<=100) {
			System.out.print(b+" ");
			b++;
		}
		
		System.out.println("===========================================================================");
		
		int j=20;
		while(j<=100) {
			if(j%2==0) {
				System.out.print(j+" ");
				
			}
		j++;	
		}
	}

}
