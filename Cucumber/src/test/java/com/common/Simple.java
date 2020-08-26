package com.common;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Simple {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println("Enter the no of liters to fill the tank");
		int c = sc.nextInt();
		if(c <= 0)
		{
		    System.out.println(c + " is an Invalid Input");
		    System.exit(0);
		}
		System.out.println("Enter the distance covered");
		int d = sc.nextInt();
		if(d <=0)
		{
		    System.out.println(d + " is an Invalid Input");
		    System.exit(0);
		}
		
		
		    
		    double x = (c/d)*100;
		    double y = d * 0.6214;
		    double z = c*0.2642;
		    double w = y/z;
		    System.out.println("Liters/100KM\n" +f.format(x));
		    System.out.println("Miles/gallons\n" +f.format(w));
	}
}
