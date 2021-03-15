package com.class7;

import java.util.Scanner;

public class WhileLotteryExample {

	public static void main(String[] args) {
		
		Scanner input;
		int num=0;
		int lotteryNumber=17;
		
		input=new Scanner (System.in);
		
		while(num!=lotteryNumber){
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num=input.nextInt();
		}
		
		System.out.println("Congratulations you entered "+num+" is a lucky number");
	}

}
