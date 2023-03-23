package com.jav;

//overriding

public class Chinna {
public void go() {
	System.out.println("Super-go");
}
}
class Ram extends Chinna{
	public void go() {
		System.out.println("sub-go");
	}
	public static void main(String[] args) {
		Ram a = new Ram();
		a.go();
	}
}
