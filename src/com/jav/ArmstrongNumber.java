package com.jav;

public class ArmstrongNumber {
public static void main(String[] args) {
	int a =153;
	int temp = a, arm = 0, rem;
	while(a>0) {
		rem = a%10;
		arm = (rem*rem*rem)+arm;
		a = a/10;
	}
	if(temp==arm) {
		System.out.println("Armstrong Number "+arm);
	}
	else {
		System.out.println("Not Armstrong Number "+arm);
	}
}
}
