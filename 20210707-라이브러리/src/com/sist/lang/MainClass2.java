package com.sist.lang;

public class MainClass2 {

	public static void main(String[] args) {
		int i=100;
		Integer ii=i; // ����ڽ�
		int j=ii; // ��ڽ�
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		System.out.println("j="+j);
		Integer m=100;
		int k=200;
		System.out.println(m+k);
		// 1 ��� => �޼ҵ�
		int n=365;
		System.out.println(Integer.toBinaryString(n)); // 2����
		System.out.println(Integer.toHexString(n)); // 16
		System.out.println(Integer.toOctalString(n)); //8
		System.out.println(Integer.parseInt("FF",16)); // 0xFF => 16���� => 10���� => 255
		System.out.println(Integer.parseInt("100",2)); 
		System.out.println(Integer.parseInt("100",8)); 
	}

}
