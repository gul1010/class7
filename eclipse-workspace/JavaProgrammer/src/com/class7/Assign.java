package com.class7;

public class Assign {

	public static void main(String[] args) {
		
		int sum=0;
		for(int a=1; a<=50; a+=2) {
			if(a%2==1) {
				sum=sum+a;
			}
		}
		System.out.println("the odd number is "+sum);
		
		
		
		
		System.out.println("--------------------------------------------------------");
		
		int result=0;
		for(int g=2; g<=50; g+=2) {
			if(g%2==0) {
				result=result+g;
			}
			
		}	
		System.out.println("the even number is "+result);	
	}
	

}
