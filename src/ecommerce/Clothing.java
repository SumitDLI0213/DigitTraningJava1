package com.digt.ecommerce;

import java.util.Scanner;

public class Clothing extends SubCategory {

	public static Product[] mensWearProducts = { new Product("Ethnic Wear", "Black \nXXL", 1820),
			new Product("Casuals", "Black \nXL", 2520), new Product("Formals", "White \nXL", 1600),
			new Product("Sports Wear", "Red \nXXL", 1200), new Product("Party Wear", "Black \nXXL", 2200) };
	public static Product[] womensWearProducts = { new Product("Ethnic Wear", "Blue \nXL", 1600),
			new Product("Casuals", "Black \nXXL", 1700), new Product("Formals", "White \nXL", 1600),
			new Product("Sports Wear", "Red \nXXL", 1200), new Product("Party Wear", "Black \nL", 2200) };
	public static Product[] kidsWearProducts = { new Product("Ethnic Wear", "Black \nL", 420),
			new Product("Casuals", "Black \nL", 520), new Product("Formals", "White \nL", 600),
			new Product("Sports Wear", "Red \nL", 200), new Product("Casuals", "Black \nL", 700) };

	public int chooseSubCategory() {
		System.out.println("In Clothing");
		System.out.println("Choose from Categories: ");
		System.out.println("1. Men\n2. Women\n3. Kid\n");
		System.out.println("Press 9 for Exit");

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
