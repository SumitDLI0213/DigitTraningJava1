package com.digt.ecommerce;

import java.util.Scanner;

public class Electronics {
	public static Product[] laptopProducts = { new Product("Dell", "i5 \n10th gen \n8 GB RAM", 48000),
			new Product("Lenovo", "i5 \n10th gen \n8 GB RAM", 39000),
			new Product("HP", "i5 \n10th gen \n8 GB RAM", 45000),
			new Product("Acer", "i7 \n11th gen \n8 GB RAM", 62000),
			new Product("Asus", "i7 \n12th gen \n16 GB RAM", 65000) };
	public static Product[] mobileProducts = { new Product("Oppo", "6 GB RAM \n6000mAh Battery", 27999),
			new Product("Samsung", "4 GB RAM \n5000mAh Battery", 19000),
			new Product("RealMe", "6 GB RAM \n5000mAh Battery", 19000),
			new Product("OnePlus", "8 GB RAM \n8000mAh Battery", 40000),
			new Product("Vivo", "6 GB RAM \n5000mAh Battery", 28000) };
	public static Product[] Wearables = { new Product("Fire Boltt", "Black \nCircle \nVoice Control", 1800),
			new Product("Noise", "Brown \nSquare \nCall Function", 1300),
			new Product("Boat", "White \nRectangle \nCall Function", 1300),
			new Product("Fastrack", "Black \nSquare \nVoice Control", 2100),
			new Product("Fossil", "Green \nRound \nInbuilt Games", 1220) };

	public static int chooseElectronicsSubCategory() {
		System.out.println("In Electronics");
		System.out.println("Choose from Categories: ");
		System.out.println("1. Laptops\n2. Mobiles\n3. Wearables\n");
		System.out.println("Press 9 for Exit");

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
