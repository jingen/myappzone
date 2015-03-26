package com.myappzone;

import java.util.Random;

public class MyMaven {

	public int getInt(){
		Random random = new Random();
		int n = 100; //0-99
		return random.nextInt() % n;
	}
	
	public static void main(String[] args){
		System.out.println("This is MyMaven");
	}
}
