package com.digt.ecommerce;

import java.util.Scanner;

public class Grocery {
	public static Product[] Snacks = { new Product("Biscuites", "Cookies", 130),
			new Product("Chips", "Chilli Sprinkled", 35), new Product("Sweets", "MTR", 145),
			new Product("Chocolates", "Cadbury", 150), new Product("Pickles", "Spicy", 55) };
	public static Product[] HouseholdCare = { new Product("Air Fresheners", "Odonol", 330),
			new Product("Glass Cleaner", "Colin", 120), new Product("Storage Containers", "Master Cook 3 Boxes", 80),
			new Product("Floor Cleaner", "Lizol", 110), new Product("Laundry Essentials", "Ariel", 225) };
	public static Product[] SkinCare = { new Product("Face Wash", "Ponds", 360), new Product("Creams", "Nivea", 270),
			new Product("Lotions", "Nivea", 280), new Product("Soaps", "Dettol", 140),
			new Product("Talcam Powder", "Ponds", 125) };

	public static int chooseGroceriesSubCategory() {
		System.out.println("In Grocery");
		System.out.println("Choose from Categories: ");
		System.out.println("1. Snacks\n2. Household Care\n3. Skin Care\n");
		System.out.println("Press 9 for Exit");

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
