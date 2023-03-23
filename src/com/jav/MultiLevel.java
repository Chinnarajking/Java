package com.jav;

public class MultiLevel {
	public static void goes() {
		System.out.println("goes");
	}
}

class Apple extends MultiLevel {
	public void go() {
		System.out.println("go");
	}
}

class Orange extends Apple {
	public static void good() {
		System.out.println("good");
	}

	public static void main(String[] args) {
		System.out.println("Hi");
		good();

		Orange obj = new Orange();
		obj.go();
		goes();
	}
}
