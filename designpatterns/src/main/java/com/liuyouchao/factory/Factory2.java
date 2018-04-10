package com.liuyouchao.factory;

import java.util.Scanner;

/*
 * 实现一个计算机控制台程序，要求输入两个数和运算符好，得到结果
 * 
 * 上一个的缺点
 *  1.命名规范不对
 *  2.两个if判断分支，意味着系统需要做一次无用的功
 *  
 * 改进实现方式
 */
public class Factory2 {

	public static void main(String args[]){
		
		
		Scanner numberAStr = new Scanner(System.in);
		System.out.println("请输入一个数字A:");
		int numberA = numberAStr.nextInt();
		
		System.out.println("请输入一个运算符:");
		Scanner operateBStr = new Scanner(System.in);
		String operateB = operateBStr.nextLine();
		
		System.out.println("请输入一个数字C:");
		Scanner numberCStr = new Scanner(System.in);
		int numberC = numberCStr.nextInt();
		
		int result = 0;
		//使用switch ，这样系统只会做一次功
		switch (operateB)
		{
			case "+":
				result = numberA + numberC;
				break;
			case "-":
				result = numberA - numberC;
				break;				
		}
		
	}
}
