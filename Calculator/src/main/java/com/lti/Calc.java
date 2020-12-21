package com.lti;

public class Calc {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("sum="+add(10,20));
		System.out.println("diff="+sub(50,20));
		System.out.println("sum="+add(10,50));
		System.out.println("mul="+mul(10,50));
	}

}
