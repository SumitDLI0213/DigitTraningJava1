package com.digt.ecommerce;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to MainMenu");

			System.out.println("Choose An Option: ");
			System.out.println("1. Buy\n2. Exit\n");

			int ch = sc.nextInt();
			if (ch == 1) {

				while (true) {
					int category = Category.chooseFromCategories();

					if (category == 1) {
						while (true) {
							Clothing clothingObject = new Clothing();
							int subCategory = clothingObject.chooseSubCategory();
							int statusCode = 0;

							if (subCategory == 1) {
								statusCode = Category.performTasks(Clothing.mensWearProducts);
							} else if (subCategory == 2) {
								statusCode = Category.performTasks(Clothing.womensWearProducts);
							} else if (subCategory == 3) {
								statusCode = Category.performTasks(Clothing.kidsWearProducts);
							} else if (subCategory == 9) {
								System.out.println("Thank You For Visiting!");
								System.exit(0);
							}

							if (statusCode == 0) {
								continue;
							} else if (statusCode == 1) {
								break;
							} else if (statusCode == -1) {
								return;
							}
						}

					} else if (category == 2) {

						while (true) {
							int subCategory = Electronics.chooseElectronicsSubCategory();
							int statusCode = 0;

							if (subCategory == 1) {
								System.out.println("Laptop Products: ");
								statusCode = Category.performTasks(Electronics.laptopProducts);
							} else if (subCategory == 2) {
								System.out.println("Mobile Products: ");
								statusCode = Category.performTasks(Electronics.mobileProducts);
							} else if (subCategory == 3) {
								System.out.println("Wearables: ");
								statusCode = Category.performTasks(Electronics.Wearables);
							} else if (subCategory == 9) {
								System.out.println("Thank You For Visiting!");
								System.exit(0);
							}

							if (statusCode == 0) {
								continue;
							} else if (statusCode == 1) {
								break;
							} else if (statusCode == -1) {
								return;
							}
						}

					} else if (category == 3) {

						while (true) {
							int subCategory = Grocery.chooseGroceriesSubCategory();
							int statusCode = 0;

							if (subCategory == 1) {
								System.out.println("Snacks: ");
								statusCode = Category.performTasks(Grocery.Snacks);
							} else if (subCategory == 2) {
								System.out.println("Household Care: ");
								statusCode = Category.performTasks(Grocery.HouseholdCare);
							} else if (subCategory == 3) {
								System.out.println("Skin Care:");
								statusCode = Category.performTasks(Grocery.SkinCare);
							} else if (subCategory == 9) {
								System.out.println("Thank You For Visiting!");
								System.exit(0);
							}

							if (statusCode == 0) {
								continue;
							} else if (statusCode == 1) {
								break;
							} else if (statusCode == -1) {
								return;
							}
						}

					} else if (category == 4) {

						while (true) {
							int subCategory = Beauty.chooseBeautySubCategory();
							int statusCode = 0;

							if (subCategory == 1) {
								System.out.println("Men Products: ");
								statusCode = Category.performTasks(Beauty.menProducts);
							} else if (subCategory == 2) {
								System.out.println("Women Products: ");
								statusCode = Category.performTasks(Beauty.womenProducts);
							} else if (subCategory == 3) {
								System.out.println("Kid Products: ");
								statusCode = Category.performTasks(Beauty.kidProducts);
							} else if (subCategory == 9) {
								System.out.println("Thank You For Visiting!");
								System.exit(0);
							}

							if (statusCode == 0) {
								continue;
							} else if (statusCode == 1) {
								break;
							} else if (statusCode == -1) {
								return;
							}
						}

					} else if (category == 5) {

						while (true) {
							int subCategory = Furniture.chooseFurnitureSubCategory();
							int statusCode = 0;

							if (subCategory == 1) {
								System.out.println("Sofa: ");
								statusCode = Category.performTasks(Furniture.Sofa);
							} else if (subCategory == 2) {
								System.out.println("Table: ");
								statusCode = Category.performTasks(Furniture.Table);
							} else if (subCategory == 3) {
								System.out.println("Bed: ");
								statusCode = Category.performTasks(Furniture.Bed);
							} else if (subCategory == 9) {
								System.out.println("Thank You For Visiting!");
								System.exit(0);
							}

							if (statusCode == 0) {
								continue;
							} else if (statusCode == 1) {
								break;
							} else if (statusCode == -1) {
								return;
							}
						}

					} else if (category == 9) {
						System.out.println("Thank You For Visiting!");
						System.exit(0);
					} else {
						System.out.println("Please Select From Existing Categories!");
					}
				}

			} else if (ch == 2) {
				System.out.println("Thank You For Visiting!");
				break;
			} else {
				System.out.println("Please Choose Valid Option");
			}
		}
	}
}