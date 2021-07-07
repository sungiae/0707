package com.sist.lang;

public class MainClass2 {

	public static void main(String[] args) {
		int i=100;
		Integer ii=i; // 오토박싱
		int j=ii; // 언박싱
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		System.out.println("j="+j);
		Integer m=100;
		int k=200;
		System.out.println(m+k);
		// 1 기능 => 메소드
		int n=365;
		System.out.println(Integer.toBinaryString(n)); // 2진법
		System.out.println(Integer.toHexString(n)); // 16
		System.out.println(Integer.toOctalString(n)); //8
		System.out.println(Integer.parseInt("FF",16)); // 0xFF => 16진법 => 10진법 => 255
		System.out.println(Integer.parseInt("100",2)); 
		System.out.println(Integer.parseInt("100",8)); 
	}

}
