package com.digt.ecommerce;

import java.util.Scanner;

public class Beauty {
	public static Product[] menProducts = { new Product("A", "aa", 1220),
			new Product("B", "aa", 1220),
			new Product("C", "aa", 1220), 
			new Product("D", "aa", 1220), 
			new Product("E", "aa", 1220) };
	public static Product[] womenProducts = { new Product("E", "aa", 1220), new Product("F", "aa", 1220),
			new Product("G", "aa", 1220), new Product("H", "aa", 1220), new Product("I", "aa", 1220) };
	public static Product[] kidProducts = { new Product("J", "aa", 1220), new Product("K", "aa", 1220),
			new Product("L", "aa", 1220), new Product("M", "aa", 1220), new Product("O", "aa", 1220) };
	
	public static int chooseBeautySubCategory() {
		System.out.println("In Beauty");
		System.out.println("Choose from Categories: ");
		System.out.println("1. Men\n2. Women\n3. Kid\n");
		System.out.println("Press 9 for Exit");

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
