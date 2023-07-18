package com.digt.ecommerce;

import java.util.Scanner;

public class Furniture {
	public static Product[] Sofa = { new Product("Nilkamal", "Brown \n6 Seater Sofa", 32000),
			new Product("Durian", "Black \n3 Seater Sofa", 18020), new Product("Furny", "Grey \n5 Seater Sofa", 16999),
			new Product("Wooden Street", "Brown \n3 Seater Sofa", 12000),
			new Product("Vittoria", "Black \n6 Seater Sofa", 35000) };
	public static Product[] Table = { new Product("Wood Buzz", "Brown \n1 pcs", 2220),
			new Product("Furinno", "White \n1 pcs", 3500), new Product("Bluewud", "Black \n2 pcs", 3500),
			new Product("Feather Lite", "Brown \n1 pcs", 2500), new Product("Space wood", "Grey \n1 pcs", 2500) };
	public static Product[] Bed = { new Product("Wakefit", "White \n1 pcs", 15000),
			new Product("Furniture Kart", "Black \n1 pcs", 19200), new Product("Nilkamal", "Brown \n1 pcs", 25000),
			new Product("Sleep Well", "Grey \n1 pcs", 22200), new Product("Kurlon", "Brown \n1 pcs", 27000) };

	public static int chooseFurnitureSubCategory() {
		System.out.println("In Furniture");
		System.out.println("Choose from Categories: ");
		System.out.println("1. Sofa\n2. Table\n3. Bed\n");
		System.out.println("Press 9 for Exit");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
