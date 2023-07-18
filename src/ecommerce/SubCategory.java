package com.digt.ecommerce;

import java.util.Scanner;

abstract class SubCategory {

	abstract int chooseSubCategory();

	static void displaySubCategories(Product[] curProductSubCategories) {
		int len = curProductSubCategories.length;

		for (int i = 0; i < len; i++) {
			System.out.println("Product No. " + (i + 1));
			Product curProduct = curProductSubCategories[i];
			System.out.println(curProduct.getName());
			System.out.println(curProduct.getDescription());
			System.out.println(curProduct.getPrice());
		}
	}

	static Product inputProductsFromUser(Product[] curProductSubCategories) {
		Scanner sc = new Scanner(System.in);
		Product userChosenProduct;

		System.out.println("Choose From Products");

		int choice = sc.nextInt();
		if (choice <= 0 || choice > curProductSubCategories.length) {
			System.out.println("Please Choose from Existing Products");
			return null;
		}
		userChosenProduct = curProductSubCategories[choice - 1];
		System.out.println("You Have Choosen: ");
		System.out.println(userChosenProduct.getName());
		System.out.println(userChosenProduct.getDescription());
		System.out.println(userChosenProduct.getPrice());

		return userChosenProduct;
	}

}
