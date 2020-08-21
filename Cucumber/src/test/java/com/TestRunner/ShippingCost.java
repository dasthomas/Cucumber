package com.TestRunner;

import java.util.Scanner;

public class ShippingCost {

	public static void main(String[] args) {
		int totalshippingcost = 0;
		Scanner scan=new Scanner(System.in);
		
	   for(int i=1;i<=3;i++) {
		   System.out.println("Shippincost of " + i + " is ");
		   int shippingcost=scan.nextInt();
		   
		   totalshippingcost+=shippingcost;
		    }
	   System.out.println("Total Shipping cost" +totalshippingcost);
	}
}
