package com.common;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Simple {
	static int count=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totaldigit=sc.nextInt();
		int countdigit=sc.nextInt();
		
		

         String to=Integer.toString(totaldigit);
         char[] ch=to.toCharArray();
         String num=Integer.toString(countdigit);
         char[] change=num.toCharArray();
         for(int i=0;i<=num.length()-1;i++) {
        	 if(String.valueOf(change[i]).contains(to)) {
        		 count++;
        	 }
         }
        System.out.println("Number of digits: " + count);
    }

}
