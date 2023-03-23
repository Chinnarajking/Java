package com.jav;

public class OverLoading {
	public static void go() {
		System.out.println("go");
	}
public static void go(int a) {
	System.out.println(a);
}
public static void go(String b) {
	System.out.println(b);
}
public static void good() {
	System.out.println("good");
}
public static void main(String[] args) {
	good();
	go();
	go(10);
	go("Ram");
}
}
