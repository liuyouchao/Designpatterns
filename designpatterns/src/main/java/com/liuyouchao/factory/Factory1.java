package com.liuyouchao.factory;

import java.util.Scanner;

/*
 * 实现一个计算机控制台程序，要求输入两个数和运算符好，得到结果
 * 1.最简单的实现方式
 */
public class Factory1 {

	public static void main(String args[]){
		
		
		Scanner A = new Scanner(System.in);
		System.out.println("请输入一个数字A:");
		int a = A.nextInt();
		
		System.out.println("请输入一个运算符:");
		Scanner B = new Scanner(System.in);
		String b = B.nextLine();
		
		System.out.println("请输入一个数字C:");
		Scanner C = new Scanner(System.in);
		int c = C.nextInt();
		
		int D = 0;
		if("+".equals(b)){
			D = a + c;
		}
		if("-".equals(b)){
			D = a - c;
		}
		System.out.println("计算的结果是D = " + D);
	}
}
