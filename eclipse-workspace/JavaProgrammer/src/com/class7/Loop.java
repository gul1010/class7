package com.class7;

public class Loop {

	public static void main(String[] args) {
		
		int time=17;
		while (time<12) {
			System.out.println("Hello");
			time--;
		}
		
		System.out.println("---------------------------from 1 to 11-----------------------------------------------");
		
		int a=1;
		
		while(a<=11) {
			System.out.println(a+ " ");
			a++;
		}
		
		System.out.println("----------------------from 10 to 1-----------------------------------------------");
		
		int b=10;
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		
		System.out.println("-----------------------------from 20 to 40-----------------------------------------------------");
        
		b=20;
		while(b<=40) {
			System.out.print(b+" ");
			b++;
		}
	}

}
