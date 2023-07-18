package com.digt.ecommerce;

import java.util.Scanner;

public class Category {

	static int chooseFromCategories() {
		System.out.println("Choose from Categories: ");
		System.out.println("1. Clothing\n2. Electronics\n3. Grocery\n4. Beauty\n5. Furniture");
		System.out.println("\nPress 9 for Exit");

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	static int performTasks(Product[] curProductList) {
		SubCategory.displaySubCategories(curProductList);

		Product selectedProduct = SubCategory.inputProductsFromUser(curProductList);
		if (selectedProduct == null) {
			return 0;
		}

		int statusCode = Category.confirmPurchasing(selectedProduct);
		if (statusCode == 1) {
			return 0;
		}

		boolean returnToMain = Category.returnToMainMenu();
		if (returnToMain) {
			return 1;
		}
		return -1;
	}

	static int confirmPurchasing(Product selectedProduct) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Are You Sure You Want to Purchase: (Y/N): ");
		String c = sc.next();
		if (c.equalsIgnoreCase("Y")) {
			System.out.println("Thank You For Purchasing!");
			System.out.println("Bill Amount: " + selectedProduct.getPrice());
			return 0;
		}
		System.out.println("Would You Like to Switch Sub Category? (Y/N): ");
		c = sc.next();
		if (c.equals("Y")) {
			return 1;
		}
		return -1;
	}

	static boolean returnToMainMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Do You Want To Return to MainMenu: (Y/N): ");
		String c = sc.next();
		if (c.equalsIgnoreCase("Y")) {
			return true;
		}
		System.out.println("Thank You For Visiting Us!");
		System.out.println("Bye Bye!");
		return false;
	}
}
