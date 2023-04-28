package com.core;

import java.util.Scanner;

public class Plandrom {
	
	public static void main (String args[]) {
		
		Scanner s = new Scanner(System.in);//I am Taking the Scanner class
		
		String str = s.next();//I am define the String variable,and I am taking next()method in the stringclass.
		
		int len = str.length();// I am taking the int variable and in the string I am taking the length method()
		
		String rev="";// I am Taking String Variable rev.
	
	
		
	for(int i =len-1;i>=0;i--) {//I AM Creating the For loop, First I am Taking int i variable next i am assing to you leng-1,I am taking greater ,and decerementvariable.
		
		rev=rev+str.charAt(i);//
	}
	
	System.out.println(rev);

}}
